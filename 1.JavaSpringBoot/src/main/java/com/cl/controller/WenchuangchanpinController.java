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

import com.cl.entity.WenchuangchanpinEntity;
import com.cl.entity.view.WenchuangchanpinView;

import com.cl.service.WenchuangchanpinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 文创产品
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
@RestController
@RequestMapping("/wenchuangchanpin")
public class WenchuangchanpinController {
    @Autowired
    private WenchuangchanpinService wenchuangchanpinService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenchuangchanpinEntity wenchuangchanpin,
		HttpServletRequest request){
        EntityWrapper<WenchuangchanpinEntity> ew = new EntityWrapper<WenchuangchanpinEntity>();

		PageUtils page = wenchuangchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenchuangchanpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenchuangchanpinEntity wenchuangchanpin, 
		HttpServletRequest request){
        EntityWrapper<WenchuangchanpinEntity> ew = new EntityWrapper<WenchuangchanpinEntity>();

		PageUtils page = wenchuangchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenchuangchanpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenchuangchanpinEntity wenchuangchanpin){
       	EntityWrapper<WenchuangchanpinEntity> ew = new EntityWrapper<WenchuangchanpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenchuangchanpin, "wenchuangchanpin")); 
        return R.ok().put("data", wenchuangchanpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenchuangchanpinEntity wenchuangchanpin){
        EntityWrapper< WenchuangchanpinEntity> ew = new EntityWrapper< WenchuangchanpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenchuangchanpin, "wenchuangchanpin")); 
		WenchuangchanpinView wenchuangchanpinView =  wenchuangchanpinService.selectView(ew);
		return R.ok("查询文创产品成功").put("data", wenchuangchanpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenchuangchanpinEntity wenchuangchanpin = wenchuangchanpinService.selectById(id);
		wenchuangchanpin = wenchuangchanpinService.selectView(new EntityWrapper<WenchuangchanpinEntity>().eq("id", id));
        return R.ok().put("data", wenchuangchanpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenchuangchanpinEntity wenchuangchanpin = wenchuangchanpinService.selectById(id);
		wenchuangchanpin = wenchuangchanpinService.selectView(new EntityWrapper<WenchuangchanpinEntity>().eq("id", id));
        return R.ok().put("data", wenchuangchanpin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenchuangchanpinEntity wenchuangchanpin, HttpServletRequest request){
    	wenchuangchanpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenchuangchanpin);
        wenchuangchanpinService.insert(wenchuangchanpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WenchuangchanpinEntity wenchuangchanpin, HttpServletRequest request){
    	wenchuangchanpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenchuangchanpin);
        wenchuangchanpinService.insert(wenchuangchanpin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WenchuangchanpinEntity wenchuangchanpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenchuangchanpin);
        wenchuangchanpinService.updateById(wenchuangchanpin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenchuangchanpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
