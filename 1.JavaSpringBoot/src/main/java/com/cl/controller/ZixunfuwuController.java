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

import com.cl.entity.ZixunfuwuEntity;
import com.cl.entity.view.ZixunfuwuView;

import com.cl.service.ZixunfuwuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 资讯服务
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@RestController
@RequestMapping("/zixunfuwu")
public class ZixunfuwuController {
    @Autowired
    private ZixunfuwuService zixunfuwuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZixunfuwuEntity zixunfuwu,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<ZixunfuwuEntity> ew = new EntityWrapper<ZixunfuwuEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = zixunfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixunfuwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZixunfuwuEntity zixunfuwu, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<ZixunfuwuEntity> ew = new EntityWrapper<ZixunfuwuEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = zixunfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixunfuwu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZixunfuwuEntity zixunfuwu){
       	EntityWrapper<ZixunfuwuEntity> ew = new EntityWrapper<ZixunfuwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zixunfuwu, "zixunfuwu")); 
        return R.ok().put("data", zixunfuwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZixunfuwuEntity zixunfuwu){
        EntityWrapper< ZixunfuwuEntity> ew = new EntityWrapper< ZixunfuwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zixunfuwu, "zixunfuwu")); 
		ZixunfuwuView zixunfuwuView =  zixunfuwuService.selectView(ew);
		return R.ok("查询资讯服务成功").put("data", zixunfuwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZixunfuwuEntity zixunfuwu = zixunfuwuService.selectById(id);
		zixunfuwu = zixunfuwuService.selectView(new EntityWrapper<ZixunfuwuEntity>().eq("id", id));
        return R.ok().put("data", zixunfuwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZixunfuwuEntity zixunfuwu = zixunfuwuService.selectById(id);
		zixunfuwu = zixunfuwuService.selectView(new EntityWrapper<ZixunfuwuEntity>().eq("id", id));
        return R.ok().put("data", zixunfuwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZixunfuwuEntity zixunfuwu, HttpServletRequest request){
    	zixunfuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixunfuwu);
        zixunfuwuService.insert(zixunfuwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZixunfuwuEntity zixunfuwu, HttpServletRequest request){
    	zixunfuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixunfuwu);
        zixunfuwuService.insert(zixunfuwu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZixunfuwuEntity zixunfuwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zixunfuwu);
        zixunfuwuService.updateById(zixunfuwu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zixunfuwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
