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

import com.cl.entity.DaolanEntity;
import com.cl.entity.view.DaolanView;

import com.cl.service.DaolanService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 导览
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@RestController
@RequestMapping("/daolan")
public class DaolanController {
    @Autowired
    private DaolanService daolanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DaolanEntity daolan,
		HttpServletRequest request){
        EntityWrapper<DaolanEntity> ew = new EntityWrapper<DaolanEntity>();

		PageUtils page = daolanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daolan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DaolanEntity daolan, 
		HttpServletRequest request){
        EntityWrapper<DaolanEntity> ew = new EntityWrapper<DaolanEntity>();

		PageUtils page = daolanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daolan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DaolanEntity daolan){
       	EntityWrapper<DaolanEntity> ew = new EntityWrapper<DaolanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( daolan, "daolan")); 
        return R.ok().put("data", daolanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DaolanEntity daolan){
        EntityWrapper< DaolanEntity> ew = new EntityWrapper< DaolanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( daolan, "daolan")); 
		DaolanView daolanView =  daolanService.selectView(ew);
		return R.ok("查询导览成功").put("data", daolanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DaolanEntity daolan = daolanService.selectById(id);
		daolan = daolanService.selectView(new EntityWrapper<DaolanEntity>().eq("id", id));
        return R.ok().put("data", daolan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DaolanEntity daolan = daolanService.selectById(id);
		daolan = daolanService.selectView(new EntityWrapper<DaolanEntity>().eq("id", id));
        return R.ok().put("data", daolan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DaolanEntity daolan, HttpServletRequest request){
    	daolan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daolan);
        daolanService.insert(daolan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DaolanEntity daolan, HttpServletRequest request){
    	daolan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daolan);
        daolanService.insert(daolan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DaolanEntity daolan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(daolan);
        daolanService.updateById(daolan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        daolanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
