package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.GoupiaoxinxiEntity;
import com.cl.entity.view.GoupiaoxinxiView;

import com.cl.service.GoupiaoxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 购票信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
@RestController
@RequestMapping("/goupiaoxinxi")
public class GoupiaoxinxiController {
    @Autowired
    private GoupiaoxinxiService goupiaoxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GoupiaoxinxiEntity goupiaoxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			goupiaoxinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GoupiaoxinxiEntity> ew = new EntityWrapper<GoupiaoxinxiEntity>();

		PageUtils page = goupiaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, goupiaoxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GoupiaoxinxiEntity goupiaoxinxi, 
		HttpServletRequest request){
        EntityWrapper<GoupiaoxinxiEntity> ew = new EntityWrapper<GoupiaoxinxiEntity>();

		PageUtils page = goupiaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, goupiaoxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GoupiaoxinxiEntity goupiaoxinxi){
       	EntityWrapper<GoupiaoxinxiEntity> ew = new EntityWrapper<GoupiaoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( goupiaoxinxi, "goupiaoxinxi")); 
        return R.ok().put("data", goupiaoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GoupiaoxinxiEntity goupiaoxinxi){
        EntityWrapper< GoupiaoxinxiEntity> ew = new EntityWrapper< GoupiaoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( goupiaoxinxi, "goupiaoxinxi")); 
		GoupiaoxinxiView goupiaoxinxiView =  goupiaoxinxiService.selectView(ew);
		return R.ok("查询购票信息成功").put("data", goupiaoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GoupiaoxinxiEntity goupiaoxinxi = goupiaoxinxiService.selectById(id);
		goupiaoxinxi = goupiaoxinxiService.selectView(new EntityWrapper<GoupiaoxinxiEntity>().eq("id", id));
        return R.ok().put("data", goupiaoxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GoupiaoxinxiEntity goupiaoxinxi = goupiaoxinxiService.selectById(id);
		goupiaoxinxi = goupiaoxinxiService.selectView(new EntityWrapper<GoupiaoxinxiEntity>().eq("id", id));
        return R.ok().put("data", goupiaoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GoupiaoxinxiEntity goupiaoxinxi, HttpServletRequest request){
    	goupiaoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(goupiaoxinxi);
        goupiaoxinxiService.insert(goupiaoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GoupiaoxinxiEntity goupiaoxinxi, HttpServletRequest request){
    	goupiaoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(goupiaoxinxi);
        goupiaoxinxiService.insert(goupiaoxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GoupiaoxinxiEntity goupiaoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(goupiaoxinxi);
        goupiaoxinxiService.updateById(goupiaoxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        goupiaoxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
