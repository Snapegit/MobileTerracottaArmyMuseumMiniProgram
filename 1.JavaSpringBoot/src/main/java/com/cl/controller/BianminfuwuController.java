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

import com.cl.entity.BianminfuwuEntity;
import com.cl.entity.view.BianminfuwuView;

import com.cl.service.BianminfuwuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 便民服务
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@RestController
@RequestMapping("/bianminfuwu")
public class BianminfuwuController {
    @Autowired
    private BianminfuwuService bianminfuwuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BianminfuwuEntity bianminfuwu,
		HttpServletRequest request){
        EntityWrapper<BianminfuwuEntity> ew = new EntityWrapper<BianminfuwuEntity>();

		PageUtils page = bianminfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bianminfuwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BianminfuwuEntity bianminfuwu, 
		HttpServletRequest request){
        EntityWrapper<BianminfuwuEntity> ew = new EntityWrapper<BianminfuwuEntity>();

		PageUtils page = bianminfuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bianminfuwu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BianminfuwuEntity bianminfuwu){
       	EntityWrapper<BianminfuwuEntity> ew = new EntityWrapper<BianminfuwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bianminfuwu, "bianminfuwu")); 
        return R.ok().put("data", bianminfuwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BianminfuwuEntity bianminfuwu){
        EntityWrapper< BianminfuwuEntity> ew = new EntityWrapper< BianminfuwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bianminfuwu, "bianminfuwu")); 
		BianminfuwuView bianminfuwuView =  bianminfuwuService.selectView(ew);
		return R.ok("查询便民服务成功").put("data", bianminfuwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BianminfuwuEntity bianminfuwu = bianminfuwuService.selectById(id);
		bianminfuwu = bianminfuwuService.selectView(new EntityWrapper<BianminfuwuEntity>().eq("id", id));
        return R.ok().put("data", bianminfuwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BianminfuwuEntity bianminfuwu = bianminfuwuService.selectById(id);
		bianminfuwu = bianminfuwuService.selectView(new EntityWrapper<BianminfuwuEntity>().eq("id", id));
        return R.ok().put("data", bianminfuwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BianminfuwuEntity bianminfuwu, HttpServletRequest request){
    	bianminfuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bianminfuwu);
        bianminfuwuService.insert(bianminfuwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BianminfuwuEntity bianminfuwu, HttpServletRequest request){
    	bianminfuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bianminfuwu);
        bianminfuwuService.insert(bianminfuwu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BianminfuwuEntity bianminfuwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bianminfuwu);
        bianminfuwuService.updateById(bianminfuwu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        bianminfuwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
