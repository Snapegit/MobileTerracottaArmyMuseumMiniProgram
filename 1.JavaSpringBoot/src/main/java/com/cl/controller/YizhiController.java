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

import com.cl.entity.YizhiEntity;
import com.cl.entity.view.YizhiView;

import com.cl.service.YizhiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 遗址
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@RestController
@RequestMapping("/yizhi")
public class YizhiController {
    @Autowired
    private YizhiService yizhiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YizhiEntity yizhi,
		HttpServletRequest request){
        EntityWrapper<YizhiEntity> ew = new EntityWrapper<YizhiEntity>();

		PageUtils page = yizhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yizhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YizhiEntity yizhi, 
		HttpServletRequest request){
        EntityWrapper<YizhiEntity> ew = new EntityWrapper<YizhiEntity>();

		PageUtils page = yizhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yizhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YizhiEntity yizhi){
       	EntityWrapper<YizhiEntity> ew = new EntityWrapper<YizhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yizhi, "yizhi")); 
        return R.ok().put("data", yizhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YizhiEntity yizhi){
        EntityWrapper< YizhiEntity> ew = new EntityWrapper< YizhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yizhi, "yizhi")); 
		YizhiView yizhiView =  yizhiService.selectView(ew);
		return R.ok("查询遗址成功").put("data", yizhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YizhiEntity yizhi = yizhiService.selectById(id);
		yizhi = yizhiService.selectView(new EntityWrapper<YizhiEntity>().eq("id", id));
        return R.ok().put("data", yizhi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YizhiEntity yizhi = yizhiService.selectById(id);
		yizhi = yizhiService.selectView(new EntityWrapper<YizhiEntity>().eq("id", id));
        return R.ok().put("data", yizhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YizhiEntity yizhi, HttpServletRequest request){
    	yizhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yizhi);
        yizhiService.insert(yizhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YizhiEntity yizhi, HttpServletRequest request){
    	yizhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yizhi);
        yizhiService.insert(yizhi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YizhiEntity yizhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yizhi);
        yizhiService.updateById(yizhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yizhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
