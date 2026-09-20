-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: cl79080159
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `cl79080159`
--

/*!40000 DROP DATABASE IF EXISTS `cl79080159`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `cl79080159` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `cl79080159`;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `address` varchar(200) NOT NULL COMMENT '地址',
  `name` varchar(200) DEFAULT NULL COMMENT '收货人',
  `phone` varchar(200) DEFAULT NULL COMMENT '电话',
  `isdefault` varchar(200) DEFAULT NULL COMMENT '是否默认地址',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2024-03-11 06:07:38','地址1','张三','19819881111','是',11),(2,'2024-03-11 06:07:38','地址2','李四','19819882222','是',12),(3,'2024-03-11 06:07:38','地址3','王五','19819883333','是',13),(4,'2024-03-11 06:07:38','地址4','赵六','19819884444','是',14),(5,'2024-03-11 06:07:38','地址5','孙七','19819885555','是',15),(6,'2024-03-11 06:07:38','地址6','周八','19819886666','是',16);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bianminfuwu`
--

DROP TABLE IF EXISTS `bianminfuwu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bianminfuwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kaifangshijian` varchar(200) DEFAULT NULL COMMENT '开放时间',
  `menpiaojiage` varchar(200) DEFAULT NULL COMMENT '门票价格',
  `mianfeizhengce` varchar(200) DEFAULT NULL COMMENT '免费政策',
  `xiuxiquyu` varchar(200) DEFAULT NULL COMMENT '休息区域',
  `chuwusheshi` varchar(200) DEFAULT NULL COMMENT '储物设施',
  `jiaotongzhinan` varchar(200) DEFAULT NULL COMMENT '交通指南',
  `canyinsheshi` varchar(200) DEFAULT NULL COMMENT '餐饮设施',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=197 DEFAULT CHARSET=utf8 COMMENT='便民服务';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bianminfuwu`
--

LOCK TABLES `bianminfuwu` WRITE;
/*!40000 ALTER TABLE `bianminfuwu` DISABLE KEYS */;
INSERT INTO `bianminfuwu` VALUES (191,'2024-03-11 06:07:39','开放时间1','门票价格1','免费政策1','休息区域1','储物设施1','交通指南1','餐饮设施1'),(192,'2024-03-11 06:07:39','开放时间2','门票价格2','免费政策2','休息区域2','储物设施2','交通指南2','餐饮设施2'),(193,'2024-03-11 06:07:39','开放时间3','门票价格3','免费政策3','休息区域3','储物设施3','交通指南3','餐饮设施3'),(194,'2024-03-11 06:07:39','开放时间4','门票价格4','免费政策4','休息区域4','储物设施4','交通指南4','餐饮设施4'),(195,'2024-03-11 06:07:39','开放时间5','门票价格5','免费政策5','休息区域5','储物设施5','交通指南5','餐饮设施5'),(196,'2024-03-11 06:07:39','开放时间6','门票价格6','免费政策6','休息区域6','储物设施6','交通指南6','餐饮设施6');
/*!40000 ALTER TABLE `bianminfuwu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bowufenlei`
--

DROP TABLE IF EXISTS `bowufenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bowufenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bowufenlei` varchar(200) DEFAULT NULL COMMENT '博物分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='博物分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bowufenlei`
--

LOCK TABLES `bowufenlei` WRITE;
/*!40000 ALTER TABLE `bowufenlei` DISABLE KEYS */;
INSERT INTO `bowufenlei` VALUES (151,'2024-03-11 06:07:39','博物分类1'),(152,'2024-03-11 06:07:39','博物分类2'),(153,'2024-03-11 06:07:39','博物分类3'),(154,'2024-03-11 06:07:39','博物分类4'),(155,'2024-03-11 06:07:39','博物分类5'),(156,'2024-03-11 06:07:39','博物分类6');
/*!40000 ALTER TABLE `bowufenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bowuguanyuyue`
--

DROP TABLE IF EXISTS `bowuguanyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bowuguanyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bowuguanmingcheng` varchar(200) DEFAULT NULL COMMENT '博物馆名称',
  `bowufenlei` varchar(200) DEFAULT NULL COMMENT '博物分类',
  `jianzaoshijian` varchar(200) DEFAULT NULL COMMENT '建造时间',
  `diliweizhi` varchar(200) DEFAULT NULL COMMENT '地理位置',
  `zhandimianji` varchar(200) DEFAULT NULL COMMENT '占地面积',
  `fajueshijian` varchar(200) DEFAULT NULL COMMENT '发掘时间',
  `zhuyaojiegou` varchar(200) DEFAULT NULL COMMENT '主要结构',
  `wenwushuliang` int(11) DEFAULT NULL COMMENT '文物数量',
  `wenwutedian` varchar(200) DEFAULT NULL COMMENT '文物特点',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='博物馆预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bowuguanyuyue`
--

LOCK TABLES `bowuguanyuyue` WRITE;
/*!40000 ALTER TABLE `bowuguanyuyue` DISABLE KEYS */;
INSERT INTO `bowuguanyuyue` VALUES (101,'2024-03-11 06:07:38','博物馆名称1','博物分类1','建造时间1','地理位置1','占地面积1','发掘时间1','主要结构1',1,'文物特点1','用户账号1','用户姓名1','2024-03-11 14:07:38'),(102,'2024-03-11 06:07:38','博物馆名称2','博物分类2','建造时间2','地理位置2','占地面积2','发掘时间2','主要结构2',2,'文物特点2','用户账号2','用户姓名2','2024-03-11 14:07:38'),(103,'2024-03-11 06:07:38','博物馆名称3','博物分类3','建造时间3','地理位置3','占地面积3','发掘时间3','主要结构3',3,'文物特点3','用户账号3','用户姓名3','2024-03-11 14:07:38'),(104,'2024-03-11 06:07:38','博物馆名称4','博物分类4','建造时间4','地理位置4','占地面积4','发掘时间4','主要结构4',4,'文物特点4','用户账号4','用户姓名4','2024-03-11 14:07:38'),(105,'2024-03-11 06:07:38','博物馆名称5','博物分类5','建造时间5','地理位置5','占地面积5','发掘时间5','主要结构5',5,'文物特点5','用户账号5','用户姓名5','2024-03-11 14:07:38'),(106,'2024-03-11 06:07:38','博物馆名称6','博物分类6','建造时间6','地理位置6','占地面积6','发掘时间6','主要结构6',6,'文物特点6','用户账号6','用户姓名6','2024-03-11 14:07:38');
/*!40000 ALTER TABLE `bowuguanyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tablename` varchar(200) DEFAULT NULL COMMENT '商品表名',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` longtext NOT NULL COMMENT '图片',
  `buynumber` int(11) DEFAULT NULL COMMENT '购买数量',
  `price` double DEFAULT NULL COMMENT '单价',
  `discountprice` double DEFAULT NULL COMMENT '折扣价',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chanpinleixing`
--

DROP TABLE IF EXISTS `chanpinleixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chanpinleixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chanpinleixing` varchar(200) DEFAULT NULL COMMENT '产品类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='产品类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chanpinleixing`
--

LOCK TABLES `chanpinleixing` WRITE;
/*!40000 ALTER TABLE `chanpinleixing` DISABLE KEYS */;
INSERT INTO `chanpinleixing` VALUES (41,'2024-03-11 06:07:38','产品类型1'),(42,'2024-03-11 06:07:38','产品类型2'),(43,'2024-03-11 06:07:38','产品类型3'),(44,'2024-03-11 06:07:38','产品类型4'),(45,'2024-03-11 06:07:38','产品类型5'),(46,'2024-03-11 06:07:38','产品类型6');
/*!40000 ALTER TABLE `chanpinleixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问内容',
  `reply` longtext COMMENT '回复内容',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='客服聊天';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (121,'2024-03-11 06:07:39',1,'提问内容1','回复内容1',1,1),(122,'2024-03-11 06:07:39',2,'提问内容2','回复内容2',2,2),(123,'2024-03-11 06:07:39',3,'提问内容3','回复内容3',3,3),(124,'2024-03-11 06:07:39',4,'提问内容4','回复内容4',4,4),(125,'2024-03-11 06:07:39',5,'提问内容5','回复内容5',5,5),(126,'2024-03-11 06:07:39',6,'提问内容6','回复内容6',6,6);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'swiper1','file/swiperPicture1.jpg'),(2,'swiper2','file/swiperPicture2.jpg'),(3,'swiper3','file/swiperPicture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daolan`
--

DROP TABLE IF EXISTS `daolan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daolan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bowuguanmingcheng` varchar(200) DEFAULT NULL COMMENT '博物馆名称',
  `daolandizhi` varchar(200) DEFAULT NULL COMMENT '导览地址',
  `tupian` longtext COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=217 DEFAULT CHARSET=utf8 COMMENT='导览';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daolan`
--

LOCK TABLES `daolan` WRITE;
/*!40000 ALTER TABLE `daolan` DISABLE KEYS */;
INSERT INTO `daolan` VALUES (211,'2024-03-11 06:07:39','博物馆名称1','导览地址1','file/daolanTupian1.jpg,file/daolanTupian2.jpg,file/daolanTupian3.jpg'),(212,'2024-03-11 06:07:39','博物馆名称2','导览地址2','file/daolanTupian2.jpg,file/daolanTupian3.jpg,file/daolanTupian4.jpg'),(213,'2024-03-11 06:07:39','博物馆名称3','导览地址3','file/daolanTupian3.jpg,file/daolanTupian4.jpg,file/daolanTupian5.jpg'),(214,'2024-03-11 06:07:39','博物馆名称4','导览地址4','file/daolanTupian4.jpg,file/daolanTupian5.jpg,file/daolanTupian6.jpg'),(215,'2024-03-11 06:07:39','博物馆名称5','导览地址5','file/daolanTupian5.jpg,file/daolanTupian6.jpg,file/daolanTupian7.jpg'),(216,'2024-03-11 06:07:39','博物馆名称6','导览地址6','file/daolanTupian6.jpg,file/daolanTupian7.jpg,file/daolanTupian8.jpg');
/*!40000 ALTER TABLE `daolan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussqinyongkeng`
--

DROP TABLE IF EXISTS `discussqinyongkeng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussqinyongkeng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秦俑坑评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussqinyongkeng`
--

LOCK TABLES `discussqinyongkeng` WRITE;
/*!40000 ALTER TABLE `discussqinyongkeng` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussqinyongkeng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusswenchuangchanpin`
--

DROP TABLE IF EXISTS `discusswenchuangchanpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusswenchuangchanpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文创产品评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusswenchuangchanpin`
--

LOCK TABLES `discusswenchuangchanpin` WRITE;
/*!40000 ALTER TABLE `discusswenchuangchanpin` DISABLE KEYS */;
/*!40000 ALTER TABLE `discusswenchuangchanpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `goupiaoxinxi`
--

DROP TABLE IF EXISTS `goupiaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `goupiaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `piaobianhao` varchar(200) DEFAULT NULL COMMENT '票编号',
  `bowuguanmingcheng` varchar(200) DEFAULT NULL COMMENT '博物馆名称',
  `jiage` double DEFAULT NULL COMMENT '价格',
  `jianzaoshijian` varchar(200) DEFAULT NULL COMMENT '建造时间',
  `diliweizhi` varchar(200) DEFAULT NULL COMMENT '地理位置',
  `zhandimianji` varchar(200) DEFAULT NULL COMMENT '占地面积',
  `fajueshijian` varchar(200) DEFAULT NULL COMMENT '发掘时间',
  `zhuyaojiegou` varchar(200) DEFAULT NULL COMMENT '主要结构',
  `wenwushuliang` int(11) DEFAULT NULL COMMENT '文物数量',
  `wenwutedian` varchar(200) DEFAULT NULL COMMENT '文物特点',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `goupiaoshijian` datetime DEFAULT NULL COMMENT '购票时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `piaobianhao` (`piaobianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='购票信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goupiaoxinxi`
--

LOCK TABLES `goupiaoxinxi` WRITE;
/*!40000 ALTER TABLE `goupiaoxinxi` DISABLE KEYS */;
INSERT INTO `goupiaoxinxi` VALUES (111,'2024-03-11 06:07:39','1111111111','博物馆名称1',1,'建造时间1','地理位置1','占地面积1','发掘时间1','主要结构1',1,'文物特点1','用户账号1','用户姓名1','2024-03-11 14:07:39'),(112,'2024-03-11 06:07:39','2222222222','博物馆名称2',2,'建造时间2','地理位置2','占地面积2','发掘时间2','主要结构2',2,'文物特点2','用户账号2','用户姓名2','2024-03-11 14:07:39'),(113,'2024-03-11 06:07:39','3333333333','博物馆名称3',3,'建造时间3','地理位置3','占地面积3','发掘时间3','主要结构3',3,'文物特点3','用户账号3','用户姓名3','2024-03-11 14:07:39'),(114,'2024-03-11 06:07:39','4444444444','博物馆名称4',4,'建造时间4','地理位置4','占地面积4','发掘时间4','主要结构4',4,'文物特点4','用户账号4','用户姓名4','2024-03-11 14:07:39'),(115,'2024-03-11 06:07:39','5555555555','博物馆名称5',5,'建造时间5','地理位置5','占地面积5','发掘时间5','主要结构5',5,'文物特点5','用户账号5','用户姓名5','2024-03-11 14:07:39'),(116,'2024-03-11 06:07:39','6666666666','博物馆名称6',6,'建造时间6','地理位置6','占地面积6','发掘时间6','主要结构6',6,'文物特点6','用户账号6','用户姓名6','2024-03-11 14:07:39');
/*!40000 ALTER TABLE `goupiaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `menujson` longtext COMMENT '菜单',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='菜单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'2024-03-11 06:07:39','[{\"backMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-rank\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"轮播图\",\"menuJump\":\"列表\",\"tableName\":\"config\"}],\"fontClass\":\"icon-common18\",\"menu\":\"轮播图管理\",\"unicode\":\"&#xedff;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-full\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"管理员\",\"menuJump\":\"列表\",\"tableName\":\"users\"},{\"appFrontIcon\":\"cuIcon-discover\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"用户\",\"menuJump\":\"列表\",\"tableName\":\"yonghu\"}],\"fontClass\":\"icon-common29\",\"menu\":\"管理员管理\",\"unicode\":\"&#xee2e;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-album\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"遗址\",\"menuJump\":\"列表\",\"tableName\":\"yizhi\"}],\"fontClass\":\"icon-common14\",\"menu\":\"遗址管理\",\"unicode\":\"&#xedfb;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-skin\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"客服聊天\",\"menuJump\":\"列表\",\"tableName\":\"chat\"}],\"fontClass\":\"icon-common4\",\"menu\":\"客服聊天管理\",\"unicode\":\"&#xedab;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-album\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\",\"查看评论\",\"首页总数\",\"首页统计\"],\"menu\":\"秦俑坑\",\"menuJump\":\"列表\",\"tableName\":\"qinyongkeng\"},{\"appFrontIcon\":\"cuIcon-keyboard\",\"buttons\":[\"查看\",\"修改\",\"删除\"],\"menu\":\"博物馆预约\",\"menuJump\":\"列表\",\"tableName\":\"bowuguanyuyue\"},{\"appFrontIcon\":\"cuIcon-camera\",\"buttons\":[\"查看\",\"修改\",\"删除\"],\"menu\":\"购票信息\",\"menuJump\":\"列表\",\"tableName\":\"goupiaoxinxi\"}],\"fontClass\":\"icon-common43\",\"menu\":\"秦俑坑管理\",\"unicode\":\"&#xef27;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-full\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"展览\",\"menuJump\":\"列表\",\"tableName\":\"zhanlan\"}],\"fontClass\":\"icon-common32\",\"menu\":\"展览\",\"unicode\":\"&#xee66;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-camera\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\",\"首页总数\",\"首页统计\"],\"menu\":\"臧品\",\"menuJump\":\"列表\",\"tableName\":\"zangpin\"}],\"fontClass\":\"icon-common23\",\"menu\":\"臧品管理\",\"unicode\":\"&#xee05;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-explore\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"资讯服务\",\"menuJump\":\"列表\",\"tableName\":\"zixunfuwu\"}],\"fontClass\":\"icon-common10\",\"menu\":\"资讯服务管理\",\"unicode\":\"&#xedd1;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-keyboard\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"产品类型\",\"menuJump\":\"列表\",\"tableName\":\"chanpinleixing\"},{\"appFrontIcon\":\"cuIcon-pic\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\",\"查看评论\"],\"menu\":\"文创产品\",\"menuJump\":\"列表\",\"tableName\":\"wenchuangchanpin\"}],\"fontClass\":\"icon-common14\",\"menu\":\"文创产品管理\",\"unicode\":\"&#xedfb;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-skin\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"便民服务\",\"menuJump\":\"列表\",\"tableName\":\"bianminfuwu\"}],\"fontClass\":\"icon-common45\",\"menu\":\"便民服务管理\",\"unicode\":\"&#xef3b;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-send\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"最新通知\",\"menuJump\":\"列表\",\"tableName\":\"zuixintongzhi\"}],\"fontClass\":\"icon-common1\",\"menu\":\"最新通知管理\",\"unicode\":\"&#xeda3;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-taxi\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"导览\",\"menuJump\":\"列表\",\"tableName\":\"daolan\"}],\"fontClass\":\"icon-common19\",\"menu\":\"导览管理\",\"unicode\":\"&#xee00;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\",\"首页总数\",\"首页统计\"],\"menu\":\"商品订单\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\",\"首页总数\",\"首页统计\"],\"menu\":\"已完成订单\",\"menuJump\":\"已完成\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\",\"首页总数\",\"首页统计\"],\"menu\":\"已发货订单\",\"menuJump\":\"已发货\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\",\"首页总数\",\"首页统计\"],\"menu\":\"未支付订单\",\"menuJump\":\"未支付\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\",\"首页总数\",\"首页统计\"],\"menu\":\"已取消订单\",\"menuJump\":\"已取消\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\",\"发货\",\"首页总数\",\"首页统计\"],\"menu\":\"已支付订单\",\"menuJump\":\"已支付\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\",\"首页总数\",\"首页统计\"],\"menu\":\"已退款订单\",\"menuJump\":\"已退款\",\"tableName\":\"orders\"}],\"menu\":\"订单管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-circle\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"博物分类\",\"menuJump\":\"列表\",\"tableName\":\"bowufenlei\"}],\"fontClass\":\"icon-common49\",\"menu\":\"博物分类管理\",\"unicode\":\"&#xef79;\"}],\"frontMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-time\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common1\",\"menu\":\"遗址\",\"menuJump\":\"列表\",\"tableName\":\"yizhi\",\"unicode\":\"&#xeda3;\"}],\"fontClass\":\"icon-common1\",\"menu\":\"遗址\",\"unicode\":\"&#xeda3;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-phone\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common15\",\"menu\":\"秦俑坑\",\"menuJump\":\"列表\",\"tableName\":\"qinyongkeng\",\"unicode\":\"&#xedfc;\"}],\"fontClass\":\"icon-common15\",\"menu\":\"秦俑坑\",\"unicode\":\"&#xedfc;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-copy\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common9\",\"menu\":\"展览\",\"menuJump\":\"列表\",\"tableName\":\"zhanlan\",\"unicode\":\"&#xedc9;\"}],\"fontClass\":\"icon-common9\",\"menu\":\"展览\",\"unicode\":\"&#xedc9;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-shop\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common27\",\"menu\":\"臧品\",\"menuJump\":\"列表\",\"tableName\":\"zangpin\",\"unicode\":\"&#xee2c;\"}],\"fontClass\":\"icon-common27\",\"menu\":\"臧品\",\"unicode\":\"&#xee2c;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-circle\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-customer-service--line\",\"menu\":\"资讯服务\",\"menuJump\":\"列表\",\"tableName\":\"zixunfuwu\",\"unicode\":\"&#xedc0;\"}],\"fontClass\":\"icon-customer-service--line\",\"menu\":\"资讯服务\",\"unicode\":\"&#xedc0;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-attentionfavor\",\"buttons\":[\"查看\",\"查看评论\"],\"fontClass\":\"icon-bar-chart-box-fill\",\"menu\":\"文创产品\",\"menuJump\":\"列表\",\"tableName\":\"wenchuangchanpin\",\"unicode\":\"&#xedb2;\"}],\"fontClass\":\"icon-bar-chart-box-fill\",\"menu\":\"文创产品\",\"unicode\":\"&#xedb2;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-camera\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-hand-heart-fill\",\"menu\":\"便民服务\",\"menuJump\":\"列表\",\"tableName\":\"bianminfuwu\",\"unicode\":\"&#xee92;\"}],\"fontClass\":\"icon-hand-heart-fill\",\"menu\":\"便民服务\",\"unicode\":\"&#xee92;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-rank\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-chat--fill\",\"menu\":\"最新通知\",\"menuJump\":\"列表\",\"tableName\":\"zuixintongzhi\",\"unicode\":\"&#xeddb;\"}],\"fontClass\":\"icon-chat--fill\",\"menu\":\"最新通知\",\"unicode\":\"&#xeddb;\"}],\"hasBackLogin\":\"是\",\"hasBackRegister\":\"否\",\"hasFrontLogin\":\"否\",\"hasFrontRegister\":\"否\",\"roleName\":\"管理员\",\"tableName\":\"users\"},{\"backMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-skin\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"客服聊天\",\"menuJump\":\"列表\",\"tableName\":\"chat\"}],\"fontClass\":\"icon-common4\",\"menu\":\"客服聊天管理\",\"unicode\":\"&#xedab;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-keyboard\",\"buttons\":[\"查看\",\"修改\",\"删除\"],\"menu\":\"博物馆预约\",\"menuJump\":\"列表\",\"tableName\":\"bowuguanyuyue\"},{\"appFrontIcon\":\"cuIcon-camera\",\"buttons\":[\"查看\",\"修改\",\"删除\"],\"menu\":\"购票信息\",\"menuJump\":\"列表\",\"tableName\":\"goupiaoxinxi\"}],\"fontClass\":\"icon-common43\",\"menu\":\"秦俑坑管理\",\"unicode\":\"&#xef27;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-medal\",\"buttons\":[\"新增\",\"查看\",\"修改\",\"删除\"],\"menu\":\"地址\",\"menuJump\":\"列表\",\"tableName\":\"address\"}],\"fontClass\":\"icon-common43\",\"menu\":\"地址管理\",\"unicode\":\"&#xef27;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\"],\"menu\":\"已支付订单\",\"menuJump\":\"已支付\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\"],\"menu\":\"已退款订单\",\"menuJump\":\"已退款\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\"],\"menu\":\"商品订单\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\"],\"menu\":\"已完成订单\",\"menuJump\":\"已完成\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\",\"确认收货\"],\"menu\":\"已发货订单\",\"menuJump\":\"已发货\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\"],\"menu\":\"未支付订单\",\"menuJump\":\"未支付\",\"tableName\":\"orders\"},{\"appFrontIcon\":\"cuIcon-vip\",\"buttons\":[\"查看\"],\"menu\":\"已取消订单\",\"menuJump\":\"已取消\",\"tableName\":\"orders\"}],\"menu\":\"订单管理\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-form\",\"buttons\":[\"查看\"],\"menu\":\"购物车\",\"menuJump\":\"列表\",\"tableName\":\"cart\"}],\"fontClass\":\"icon-common41\",\"menu\":\"购物车管理\",\"unicode\":\"&#xeede;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-attentionfavor\",\"buttons\":[\"查看\"],\"menu\":\"我的收藏\",\"menuJump\":\"1\",\"tableName\":\"storeup\"}],\"fontClass\":\"icon-common31\",\"menu\":\"我的收藏管理\",\"unicode\":\"&#xee48;\"}],\"frontMenu\":[{\"child\":[{\"appFrontIcon\":\"cuIcon-time\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common1\",\"menu\":\"遗址\",\"menuJump\":\"列表\",\"tableName\":\"yizhi\",\"unicode\":\"&#xeda3;\"}],\"fontClass\":\"icon-common1\",\"menu\":\"遗址\",\"unicode\":\"&#xeda3;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-phone\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common15\",\"menu\":\"秦俑坑\",\"menuJump\":\"列表\",\"tableName\":\"qinyongkeng\",\"unicode\":\"&#xedfc;\"}],\"fontClass\":\"icon-common15\",\"menu\":\"秦俑坑\",\"unicode\":\"&#xedfc;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-copy\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common9\",\"menu\":\"展览\",\"menuJump\":\"列表\",\"tableName\":\"zhanlan\",\"unicode\":\"&#xedc9;\"}],\"fontClass\":\"icon-common9\",\"menu\":\"展览\",\"unicode\":\"&#xedc9;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-shop\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-common27\",\"menu\":\"臧品\",\"menuJump\":\"列表\",\"tableName\":\"zangpin\",\"unicode\":\"&#xee2c;\"}],\"fontClass\":\"icon-common27\",\"menu\":\"臧品\",\"unicode\":\"&#xee2c;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-circle\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-customer-service--line\",\"menu\":\"资讯服务\",\"menuJump\":\"列表\",\"tableName\":\"zixunfuwu\",\"unicode\":\"&#xedc0;\"}],\"fontClass\":\"icon-customer-service--line\",\"menu\":\"资讯服务\",\"unicode\":\"&#xedc0;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-attentionfavor\",\"buttons\":[\"查看\",\"查看评论\"],\"fontClass\":\"icon-bar-chart-box-fill\",\"menu\":\"文创产品\",\"menuJump\":\"列表\",\"tableName\":\"wenchuangchanpin\",\"unicode\":\"&#xedb2;\"}],\"fontClass\":\"icon-bar-chart-box-fill\",\"menu\":\"文创产品\",\"unicode\":\"&#xedb2;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-camera\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-hand-heart-fill\",\"menu\":\"便民服务\",\"menuJump\":\"列表\",\"tableName\":\"bianminfuwu\",\"unicode\":\"&#xee92;\"}],\"fontClass\":\"icon-hand-heart-fill\",\"menu\":\"便民服务\",\"unicode\":\"&#xee92;\"},{\"child\":[{\"appFrontIcon\":\"cuIcon-rank\",\"buttons\":[\"查看\"],\"fontClass\":\"icon-chat--fill\",\"menu\":\"最新通知\",\"menuJump\":\"列表\",\"tableName\":\"zuixintongzhi\",\"unicode\":\"&#xeddb;\"}],\"fontClass\":\"icon-chat--fill\",\"menu\":\"最新通知\",\"unicode\":\"&#xeddb;\"}],\"hasBackLogin\":\"否\",\"hasBackRegister\":\"否\",\"hasFrontLogin\":\"是\",\"hasFrontRegister\":\"是\",\"roleName\":\"用户\",\"tableName\":\"yonghu\"}]');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orderid` varchar(200) NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) DEFAULT NULL COMMENT '商品表名',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` longtext NOT NULL COMMENT '图片',
  `buynumber` int(11) DEFAULT NULL COMMENT '购买数量',
  `price` double DEFAULT NULL COMMENT '单价',
  `discountprice` double DEFAULT NULL COMMENT '折扣价',
  `total` double DEFAULT NULL COMMENT '总价',
  `discounttotal` double DEFAULT NULL COMMENT '折扣总价格',
  `type` varchar(200) DEFAULT NULL COMMENT '支付类型',
  `status` varchar(200) DEFAULT NULL COMMENT '订单状态',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `tel` varchar(200) DEFAULT NULL COMMENT '电话',
  `consignee` varchar(200) DEFAULT NULL COMMENT '收货人',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `logistics` longtext COMMENT '物流',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qinyongkeng`
--

DROP TABLE IF EXISTS `qinyongkeng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qinyongkeng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bowuguanmingcheng` varchar(200) DEFAULT NULL COMMENT '博物馆名称',
  `bowufenlei` varchar(200) DEFAULT NULL COMMENT '博物分类',
  `jiage` double DEFAULT NULL COMMENT '价格',
  `jianzaoshijian` date DEFAULT NULL COMMENT '建造时间',
  `diliweizhi` varchar(200) DEFAULT NULL COMMENT '地理位置',
  `zhandimianji` varchar(200) DEFAULT NULL COMMENT '占地面积',
  `fajueshijian` date DEFAULT NULL COMMENT '发掘时间',
  `zhuyaojiegou` varchar(200) DEFAULT NULL COMMENT '主要结构',
  `wenwushuliang` int(11) DEFAULT NULL COMMENT '文物数量',
  `wenwutedian` varchar(200) DEFAULT NULL COMMENT '文物特点',
  `tupian` longtext COMMENT '图片',
  `storeupnum` int(11) DEFAULT NULL COMMENT '收藏数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='秦俑坑';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qinyongkeng`
--

LOCK TABLES `qinyongkeng` WRITE;
/*!40000 ALTER TABLE `qinyongkeng` DISABLE KEYS */;
INSERT INTO `qinyongkeng` VALUES (91,'2024-03-11 06:07:38','博物馆名称1','博物分类1',1,'2024-03-11','地理位置1','占地面积1','2024-03-11','主要结构1',1,'文物特点1','file/qinyongkengTupian1.jpg,file/qinyongkengTupian2.jpg,file/qinyongkengTupian3.jpg',1),(92,'2024-03-11 06:07:38','博物馆名称2','博物分类2',2,'2024-03-11','地理位置2','占地面积2','2024-03-11','主要结构2',2,'文物特点2','file/qinyongkengTupian2.jpg,file/qinyongkengTupian3.jpg,file/qinyongkengTupian4.jpg',2),(93,'2024-03-11 06:07:38','博物馆名称3','博物分类3',3,'2024-03-11','地理位置3','占地面积3','2024-03-11','主要结构3',3,'文物特点3','file/qinyongkengTupian3.jpg,file/qinyongkengTupian4.jpg,file/qinyongkengTupian5.jpg',3),(94,'2024-03-11 06:07:38','博物馆名称4','博物分类4',4,'2024-03-11','地理位置4','占地面积4','2024-03-11','主要结构4',4,'文物特点4','file/qinyongkengTupian4.jpg,file/qinyongkengTupian5.jpg,file/qinyongkengTupian6.jpg',4),(95,'2024-03-11 06:07:38','博物馆名称5','博物分类5',5,'2024-03-11','地理位置5','占地面积5','2024-03-11','主要结构5',5,'文物特点5','file/qinyongkengTupian5.jpg,file/qinyongkengTupian6.jpg,file/qinyongkengTupian7.jpg',5),(96,'2024-03-11 06:07:38','博物馆名称6','博物分类6',6,'2024-03-11','地理位置6','占地面积6','2024-03-11','主要结构6',6,'文物特点6','file/qinyongkengTupian6.jpg,file/qinyongkengTupian7.jpg,file/qinyongkengTupian8.jpg',6);
/*!40000 ALTER TABLE `qinyongkeng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) DEFAULT NULL COMMENT 'refid',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext NOT NULL COMMENT '图片',
  `type` varchar(200) DEFAULT NULL COMMENT '类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='我的收藏';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `username` varchar(200) NOT NULL COMMENT '用户名',
  `password` varchar(200) NOT NULL COMMENT '密码',
  `role` varchar(200) DEFAULT NULL COMMENT '角色',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='管理员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'2024-03-11 06:07:39','admin','admin','管理员');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wenchuangchanpin`
--

DROP TABLE IF EXISTS `wenchuangchanpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wenchuangchanpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chanpinmingcheng` varchar(200) DEFAULT NULL COMMENT '产品名称',
  `chanpinleixing` varchar(200) DEFAULT NULL COMMENT '产品类型',
  `shejiyuansu` varchar(200) DEFAULT NULL COMMENT '设计元素',
  `zhuti` varchar(200) DEFAULT NULL COMMENT '主题',
  `caizhi` varchar(200) DEFAULT NULL COMMENT '材质',
  `tupian` longtext COMMENT '图片',
  `price` double DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='文创产品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wenchuangchanpin`
--

LOCK TABLES `wenchuangchanpin` WRITE;
/*!40000 ALTER TABLE `wenchuangchanpin` DISABLE KEYS */;
INSERT INTO `wenchuangchanpin` VALUES (51,'2024-03-11 06:07:38','产品名称1','产品类型1','设计元素1','主题1','材质1','file/wenchuangchanpinTupian1.jpg,file/wenchuangchanpinTupian2.jpg,file/wenchuangchanpinTupian3.jpg',99.9),(52,'2024-03-11 06:07:38','产品名称2','产品类型2','设计元素2','主题2','材质2','file/wenchuangchanpinTupian2.jpg,file/wenchuangchanpinTupian3.jpg,file/wenchuangchanpinTupian4.jpg',99.9),(53,'2024-03-11 06:07:38','产品名称3','产品类型3','设计元素3','主题3','材质3','file/wenchuangchanpinTupian3.jpg,file/wenchuangchanpinTupian4.jpg,file/wenchuangchanpinTupian5.jpg',99.9),(54,'2024-03-11 06:07:38','产品名称4','产品类型4','设计元素4','主题4','材质4','file/wenchuangchanpinTupian4.jpg,file/wenchuangchanpinTupian5.jpg,file/wenchuangchanpinTupian6.jpg',99.9),(55,'2024-03-11 06:07:38','产品名称5','产品类型5','设计元素5','主题5','材质5','file/wenchuangchanpinTupian5.jpg,file/wenchuangchanpinTupian6.jpg,file/wenchuangchanpinTupian7.jpg',99.9),(56,'2024-03-11 06:07:38','产品名称6','产品类型6','设计元素6','主题6','材质6','file/wenchuangchanpinTupian6.jpg,file/wenchuangchanpinTupian7.jpg,file/wenchuangchanpinTupian8.jpg',99.9);
/*!40000 ALTER TABLE `wenchuangchanpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yizhi`
--

DROP TABLE IF EXISTS `yizhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yizhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `weizhi` varchar(200) DEFAULT NULL COMMENT '位置',
  `mianji` varchar(200) DEFAULT NULL COMMENT '面积',
  `faxianshijian` date DEFAULT NULL COMMENT '发现时间',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `kengneiwupin` varchar(200) DEFAULT NULL COMMENT '坑内物品',
  `lishijiazhi` varchar(200) DEFAULT NULL COMMENT '历史价值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='遗址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yizhi`
--

LOCK TABLES `yizhi` WRITE;
/*!40000 ALTER TABLE `yizhi` DISABLE KEYS */;
INSERT INTO `yizhi` VALUES (161,'2024-03-11 06:07:39','位置1','面积1','2024-03-11','类型1','坑内物品1','历史价值1'),(162,'2024-03-11 06:07:39','位置2','面积2','2024-03-11','类型2','坑内物品2','历史价值2'),(163,'2024-03-11 06:07:39','位置3','面积3','2024-03-11','类型3','坑内物品3','历史价值3'),(164,'2024-03-11 06:07:39','位置4','面积4','2024-03-11','类型4','坑内物品4','历史价值4'),(165,'2024-03-11 06:07:39','位置5','面积5','2024-03-11','类型5','坑内物品5','历史价值5'),(166,'2024-03-11 06:07:39','位置6','面积6','2024-03-11','类型6','坑内物品6','历史价值6');
/*!40000 ALTER TABLE `yizhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `yonghumima` varchar(200) NOT NULL COMMENT '用户密码',
  `yonghuxingming` varchar(200) NOT NULL COMMENT '用户姓名',
  `touxiang` longtext COMMENT '头像',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `pquestion` varchar(200) DEFAULT NULL COMMENT '密保问题',
  `panswer` varchar(200) DEFAULT NULL COMMENT '密保答案',
  `money` double DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (31,'2024-03-11 06:07:38','用户账号1','e10adc3949ba59abbe56e057f20f883e','用户姓名1','file/yonghuTouxiang1.jpg','男','19819881111','密保问题1','密保答案1',200),(32,'2024-03-11 06:07:38','用户账号2','e10adc3949ba59abbe56e057f20f883e','用户姓名2','file/yonghuTouxiang2.jpg','男','19819881112','密保问题2','密保答案2',200),(33,'2024-03-11 06:07:38','用户账号3','e10adc3949ba59abbe56e057f20f883e','用户姓名3','file/yonghuTouxiang3.jpg','男','19819881113','密保问题3','密保答案3',200),(34,'2024-03-11 06:07:38','用户账号4','e10adc3949ba59abbe56e057f20f883e','用户姓名4','file/yonghuTouxiang4.jpg','男','19819881114','密保问题4','密保答案4',200),(35,'2024-03-11 06:07:38','用户账号5','e10adc3949ba59abbe56e057f20f883e','用户姓名5','file/yonghuTouxiang5.jpg','男','19819881115','密保问题5','密保答案5',200),(36,'2024-03-11 06:07:38','用户账号6','e10adc3949ba59abbe56e057f20f883e','用户姓名6','file/yonghuTouxiang6.jpg','男','19819881116','密保问题6','密保答案6',200);
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zangpin`
--

DROP TABLE IF EXISTS `zangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '臧品名称',
  `shidai` varchar(200) DEFAULT NULL COMMENT '时代',
  `chicun` varchar(200) DEFAULT NULL COMMENT '尺寸',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地质',
  `tupian` longtext COMMENT '图片',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8 COMMENT='臧品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zangpin`
--

LOCK TABLES `zangpin` WRITE;
/*!40000 ALTER TABLE `zangpin` DISABLE KEYS */;
INSERT INTO `zangpin` VALUES (171,'2024-03-11 06:07:39','臧品名称1','时代1','尺寸1','地质1','file/zangpinTupian1.jpg,file/zangpinTupian2.jpg,file/zangpinTupian3.jpg','2024-03-11 14:07:39'),(172,'2024-03-11 06:07:39','臧品名称2','时代2','尺寸2','地质2','file/zangpinTupian2.jpg,file/zangpinTupian3.jpg,file/zangpinTupian4.jpg','2024-03-11 14:07:39'),(173,'2024-03-11 06:07:39','臧品名称3','时代3','尺寸3','地质3','file/zangpinTupian3.jpg,file/zangpinTupian4.jpg,file/zangpinTupian5.jpg','2024-03-11 14:07:39'),(174,'2024-03-11 06:07:39','臧品名称4','时代4','尺寸4','地质4','file/zangpinTupian4.jpg,file/zangpinTupian5.jpg,file/zangpinTupian6.jpg','2024-03-11 14:07:39'),(175,'2024-03-11 06:07:39','臧品名称5','时代5','尺寸5','地质5','file/zangpinTupian5.jpg,file/zangpinTupian6.jpg,file/zangpinTupian7.jpg','2024-03-11 14:07:39'),(176,'2024-03-11 06:07:39','臧品名称6','时代6','尺寸6','地质6','file/zangpinTupian6.jpg,file/zangpinTupian7.jpg,file/zangpinTupian8.jpg','2024-03-11 14:07:39');
/*!40000 ALTER TABLE `zangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhanlan`
--

DROP TABLE IF EXISTS `zhanlan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhanlan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanpinmingcheng` varchar(200) DEFAULT NULL COMMENT '展品名称',
  `zhanpinmiaoshu` longtext COMMENT '展品描述',
  `zhanpintupian` longtext COMMENT '展品图片',
  `xiangguangushi` varchar(200) DEFAULT NULL COMMENT '相关故事',
  `canguanxianlujianyi` varchar(200) DEFAULT NULL COMMENT '参观线路建议',
  `zhuyishixiang` longtext COMMENT '注意事项',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='展览';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhanlan`
--

LOCK TABLES `zhanlan` WRITE;
/*!40000 ALTER TABLE `zhanlan` DISABLE KEYS */;
INSERT INTO `zhanlan` VALUES (141,'2024-03-11 06:07:39','展品名称1','展品描述1','file/zhanlanZhanpintupian1.jpg,file/zhanlanZhanpintupian2.jpg,file/zhanlanZhanpintupian3.jpg','相关故事1','参观线路建议1','注意事项1','2024-03-11 14:07:39'),(142,'2024-03-11 06:07:39','展品名称2','展品描述2','file/zhanlanZhanpintupian2.jpg,file/zhanlanZhanpintupian3.jpg,file/zhanlanZhanpintupian4.jpg','相关故事2','参观线路建议2','注意事项2','2024-03-11 14:07:39'),(143,'2024-03-11 06:07:39','展品名称3','展品描述3','file/zhanlanZhanpintupian3.jpg,file/zhanlanZhanpintupian4.jpg,file/zhanlanZhanpintupian5.jpg','相关故事3','参观线路建议3','注意事项3','2024-03-11 14:07:39'),(144,'2024-03-11 06:07:39','展品名称4','展品描述4','file/zhanlanZhanpintupian4.jpg,file/zhanlanZhanpintupian5.jpg,file/zhanlanZhanpintupian6.jpg','相关故事4','参观线路建议4','注意事项4','2024-03-11 14:07:39'),(145,'2024-03-11 06:07:39','展品名称5','展品描述5','file/zhanlanZhanpintupian5.jpg,file/zhanlanZhanpintupian6.jpg,file/zhanlanZhanpintupian7.jpg','相关故事5','参观线路建议5','注意事项5','2024-03-11 14:07:39'),(146,'2024-03-11 06:07:39','展品名称6','展品描述6','file/zhanlanZhanpintupian6.jpg,file/zhanlanZhanpintupian7.jpg,file/zhanlanZhanpintupian8.jpg','相关故事6','参观线路建议6','注意事项6','2024-03-11 14:07:39');
/*!40000 ALTER TABLE `zhanlan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zixunfuwu`
--

DROP TABLE IF EXISTS `zixunfuwu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zixunfuwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tupian` longtext COMMENT '图片',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `neirong` longtext COMMENT '内容',
  `riqi` date DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=187 DEFAULT CHARSET=utf8 COMMENT='资讯服务';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zixunfuwu`
--

LOCK TABLES `zixunfuwu` WRITE;
/*!40000 ALTER TABLE `zixunfuwu` DISABLE KEYS */;
INSERT INTO `zixunfuwu` VALUES (181,'2024-03-11 06:07:39','file/zixunfuwuTupian1.jpg,file/zixunfuwuTupian2.jpg,file/zixunfuwuTupian3.jpg','标题1','内容1','2024-03-11'),(182,'2024-03-11 06:07:39','file/zixunfuwuTupian2.jpg,file/zixunfuwuTupian3.jpg,file/zixunfuwuTupian4.jpg','标题2','内容2','2024-03-11'),(183,'2024-03-11 06:07:39','file/zixunfuwuTupian3.jpg,file/zixunfuwuTupian4.jpg,file/zixunfuwuTupian5.jpg','标题3','内容3','2024-03-11'),(184,'2024-03-11 06:07:39','file/zixunfuwuTupian4.jpg,file/zixunfuwuTupian5.jpg,file/zixunfuwuTupian6.jpg','标题4','内容4','2024-03-11'),(185,'2024-03-11 06:07:39','file/zixunfuwuTupian5.jpg,file/zixunfuwuTupian6.jpg,file/zixunfuwuTupian7.jpg','标题5','内容5','2024-03-11'),(186,'2024-03-11 06:07:39','file/zixunfuwuTupian6.jpg,file/zixunfuwuTupian7.jpg,file/zixunfuwuTupian8.jpg','标题6','内容6','2024-03-11');
/*!40000 ALTER TABLE `zixunfuwu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zuixintongzhi`
--

DROP TABLE IF EXISTS `zuixintongzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zuixintongzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `neirong` longtext COMMENT '内容',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `tupian` longtext COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8 COMMENT='最新通知';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zuixintongzhi`
--

LOCK TABLES `zuixintongzhi` WRITE;
/*!40000 ALTER TABLE `zuixintongzhi` DISABLE KEYS */;
INSERT INTO `zuixintongzhi` VALUES (201,'2024-03-11 06:07:39','标题1','内容1','2024-03-11 14:07:39','file/zuixintongzhiTupian1.jpg,file/zuixintongzhiTupian2.jpg,file/zuixintongzhiTupian3.jpg'),(202,'2024-03-11 06:07:39','标题2','内容2','2024-03-11 14:07:39','file/zuixintongzhiTupian2.jpg,file/zuixintongzhiTupian3.jpg,file/zuixintongzhiTupian4.jpg'),(203,'2024-03-11 06:07:39','标题3','内容3','2024-03-11 14:07:39','file/zuixintongzhiTupian3.jpg,file/zuixintongzhiTupian4.jpg,file/zuixintongzhiTupian5.jpg'),(204,'2024-03-11 06:07:39','标题4','内容4','2024-03-11 14:07:39','file/zuixintongzhiTupian4.jpg,file/zuixintongzhiTupian5.jpg,file/zuixintongzhiTupian6.jpg'),(205,'2024-03-11 06:07:39','标题5','内容5','2024-03-11 14:07:39','file/zuixintongzhiTupian5.jpg,file/zuixintongzhiTupian6.jpg,file/zuixintongzhiTupian7.jpg'),(206,'2024-03-11 06:07:39','标题6','内容6','2024-03-11 14:07:39','file/zuixintongzhiTupian6.jpg,file/zuixintongzhiTupian7.jpg,file/zuixintongzhiTupian8.jpg');
/*!40000 ALTER TABLE `zuixintongzhi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-12 20:38:11
