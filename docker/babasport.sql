/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : babasport

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 22/12/2018 00:42:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bbs_addr
-- ----------------------------
DROP TABLE IF EXISTS `bbs_addr`;
CREATE TABLE `bbs_addr`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'z主键',
  `buyer_id` bigint(20) NULL DEFAULT NULL COMMENT '用户Id',
  `name` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '收货人',
  `phone` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机号或是固定电话号',
  `province_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省编码',
  `province_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省名称',
  `city_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '市编码',
  `city_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '市名称',
  `town_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '县编码',
  `town_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '县名称',
  `addr` varchar(400) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '收货地址',
  `is_def` int(1) NULL DEFAULT NULL COMMENT '是否默认',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '收货地址' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_brand
-- ----------------------------
DROP TABLE IF EXISTS `bbs_brand`;
CREATE TABLE `bbs_brand`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '名称',
  `description` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '描述',
  `img_uri` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片URI',
  `web_site` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '品牌网址',
  `sort` int(11) NULL DEFAULT NULL COMMENT '排序:最大最排前',
  `is_display` int(1) NULL DEFAULT NULL COMMENT '是否可见 1:可见 0:不可见',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '品牌' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_buyer
-- ----------------------------
DROP TABLE IF EXISTS `bbs_buyer`;
CREATE TABLE `bbs_buyer`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `gender` int(1) NULL DEFAULT NULL COMMENT '性别 0:保密  1:男  2:女',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `real_name` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '真实名字',
  `register_time` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  `province_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省编码',
  `province_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省名称',
  `city_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '市编码',
  `city_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '市名称',
  `town_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '县编码',
  `town_name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '县名称',
  `addr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址',
  `is_del` int(1) NULL DEFAULT NULL COMMENT '是否已删除:0:未,1:删除了',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '购买者' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_city
-- ----------------------------
DROP TABLE IF EXISTS `bbs_city`;
CREATE TABLE `bbs_city`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '城市编码',
  `name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '城市名称',
  `province_code` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属省份编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 345 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '城市信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_color
-- ----------------------------
DROP TABLE IF EXISTS `bbs_color`;
CREATE TABLE `bbs_color`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
  `parent_id` bigint(20) NULL DEFAULT NULL COMMENT '父ID为色系',
  `img_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '颜色对应的衣服小图',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '颜色大全' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_detail
-- ----------------------------
DROP TABLE IF EXISTS `bbs_detail`;
CREATE TABLE `bbs_detail`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` bigint(20) NULL DEFAULT NULL COMMENT '订单ID',
  `product_id` bigint(20) NULL DEFAULT NULL COMMENT '商品Id',
  `product_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品编号',
  `product_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `color` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT ' 颜色名称',
  `size` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '尺码',
  `sku_price` double NULL DEFAULT NULL COMMENT '商品销售价',
  `amount` int(11) NULL DEFAULT NULL COMMENT '购买数量',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_order_id`(`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 49 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '订单详情' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_employee
-- ----------------------------
DROP TABLE IF EXISTS `bbs_employee`;
CREATE TABLE `bbs_employee`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `degree` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '学历',
  `email` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `gender` int(1) NULL DEFAULT NULL COMMENT '性别 0：男 1：女',
  `img_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片(头像)',
  `phone` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '手机',
  `real_name` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '真实名字',
  `school` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '毕业学校',
  `is_del` int(1) NOT NULL COMMENT '是否删除 1:未删除 0:删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '员工' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_feature
-- ----------------------------
DROP TABLE IF EXISTS `bbs_feature`;
CREATE TABLE `bbs_feature`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
  `value` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `sort` int(11) NULL DEFAULT NULL COMMENT '前台排序',
  `is_del` int(1) NULL DEFAULT NULL COMMENT '是否废弃:1:未废弃,0:废弃了',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '属性表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_img
-- ----------------------------
DROP TABLE IF EXISTS `bbs_img`;
CREATE TABLE `bbs_img`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_id` bigint(20) NULL DEFAULT NULL COMMENT '商品ID',
  `uri` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片URI',
  `is_def` int(1) NULL DEFAULT NULL COMMENT '是否默认:0否 1:是',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `product_id`(`product_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 428 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '图片' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_order
-- ----------------------------
DROP TABLE IF EXISTS `bbs_order`;
CREATE TABLE `bbs_order`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_no` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单号',
  `deliver_fee` double(10, 2) NULL DEFAULT NULL COMMENT '运费',
  `payable_fee` double NULL DEFAULT NULL COMMENT '应付金额',
  `total_price` double NULL DEFAULT NULL COMMENT '订单金额',
  `payment_way` int(1) NULL DEFAULT NULL COMMENT '支付方式 0:到付 1:在线 2:邮局 3:公司转帐',
  `payment_cash` int(1) NULL DEFAULT NULL COMMENT '货到付款方式.1现金,2POS刷卡',
  `delivery` int(1) NULL DEFAULT NULL COMMENT '送货时间 0:只工作日送货（双休日，节假日不送） 1:只双休日，假日送货   2:工作日，双休日，假日均可送货',
  `is_confirm` int(1) NULL DEFAULT NULL COMMENT '是否电话确认 1:是  0: 否',
  `is_paiy` int(1) NULL DEFAULT NULL COMMENT '支付状态 :0到付1待付款,2已付款,3待退款,4退款成功,5退款失败',
  `state` int(1) NULL DEFAULT NULL COMMENT '订单状态 0:提交订单 1:仓库配货 2:商品出库 3:等待收货 4:完成 5待退货 6已退货',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '订单生成时间',
  `deliver_goods_time` datetime(0) NULL DEFAULT NULL COMMENT '发货时间',
  `expected_delivery_time` datetime(0) NULL DEFAULT NULL COMMENT '预计送达时间',
  `note` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '附言',
  `buyer_id` bigint(20) NULL DEFAULT NULL COMMENT '用户Id',
  `addr_id` bigint(20) NULL DEFAULT NULL COMMENT '地址Id',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `buyer_id`(`buyer_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 58 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `bbs_order_detail`;
CREATE TABLE `bbs_order_detail`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键Id',
  `order_id` bigint(20) NULL DEFAULT NULL COMMENT '订单Id',
  `sku_id` bigint(20) NULL DEFAULT NULL COMMENT '库存Id -->因为库存Id才能定位到一条具体的商品',
  `product_id` bigint(20) NULL DEFAULT NULL COMMENT '商品Id',
  `product_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品编号',
  `product_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `product_price` double NULL DEFAULT NULL COMMENT '商品价格',
  `product_color` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品颜色',
  `product_size` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品尺寸',
  `num` int(11) NULL DEFAULT NULL COMMENT '购买的数量',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_product
-- ----------------------------
DROP TABLE IF EXISTS `bbs_product`;
CREATE TABLE `bbs_product`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `no` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品编号',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `weight` double(11, 0) NULL DEFAULT NULL COMMENT '重量 单位:克',
  `is_new` int(1) NULL DEFAULT NULL COMMENT '是否新品:0:旧品,1:新品',
  `is_hot` int(1) NULL DEFAULT NULL COMMENT '是否热销:0,否 1:是',
  `is_show` int(1) NULL DEFAULT NULL COMMENT '上下架:0否 1是',
  `is_commend` int(1) NULL DEFAULT NULL COMMENT '推荐 1推荐 0 不推荐',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '添加时间',
  `create_user_id` bigint(20) NULL DEFAULT NULL COMMENT '添加人ID',
  `check_time` datetime(0) NULL DEFAULT NULL COMMENT '审核时间',
  `check_user_id` bigint(20) NULL DEFAULT NULL COMMENT '审核人ID',
  `type_id` bigint(20) NULL DEFAULT NULL COMMENT '类型ID',
  `brand_id` bigint(20) NULL DEFAULT NULL COMMENT '品牌ID',
  `keywords` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '检索关键词',
  `sales` int(11) NULL DEFAULT NULL COMMENT '销量',
  `description` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '商品描述',
  `package_list` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '包装清单',
  `feature` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品属性集',
  `color` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '颜色集',
  `size` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '尺寸集',
  `is_del` int(1) NULL DEFAULT NULL COMMENT '是否删除:0删除,1,没删除',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `type_id`(`type_id`) USING BTREE,
  INDEX `brand_id`(`brand_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 275 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '商品' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_province
-- ----------------------------
DROP TABLE IF EXISTS `bbs_province`;
CREATE TABLE `bbs_province`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省份编码',
  `name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省份名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '省份信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_sku
-- ----------------------------
DROP TABLE IF EXISTS `bbs_sku`;
CREATE TABLE `bbs_sku`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_id` bigint(20) NULL DEFAULT NULL COMMENT '商品ID',
  `product_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品编号',
  `color_id` bigint(20) NULL DEFAULT NULL COMMENT '颜色ID',
  `color_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '颜色名称',
  `size` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '尺码',
  `delive_fee` double NULL DEFAULT NULL COMMENT '运费 默认10元',
  `sku_price` double(20, 2) NULL DEFAULT NULL COMMENT '售价',
  `stock_inventory` int(5) NULL DEFAULT NULL COMMENT '库存',
  `sku_upper_limit` int(5) NULL DEFAULT NULL COMMENT '购买限制',
  `location` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '仓库位置:货架号',
  `sku_img` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'SKU图片  精确到颜色及尺码对应的图片',
  `sku_sort` int(5) NULL DEFAULT NULL COMMENT '前台显示排序',
  `sku_name` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'SKU名称',
  `market_price` double(20, 2) NULL DEFAULT NULL COMMENT '市场价',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `create_user_id` bigint(20) NULL DEFAULT NULL,
  `update_user_id` bigint(20) NULL DEFAULT NULL,
  `last_status` int(1) NULL DEFAULT NULL COMMENT '0,历史 1最新',
  `sku_type` int(1) NULL DEFAULT NULL COMMENT '0:赠品,1普通',
  `sales` int(10) NULL DEFAULT NULL COMMENT '销量',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `product_id`(`product_id`) USING BTREE,
  INDEX `color_id`(`color_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 852 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '最小销售单元' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_town
-- ----------------------------
DROP TABLE IF EXISTS `bbs_town`;
CREATE TABLE `bbs_town`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '区县编码',
  `name` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '区县名称',
  `city_code` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属城市编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3144 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '区县信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_type
-- ----------------------------
DROP TABLE IF EXISTS `bbs_type`;
CREATE TABLE `bbs_type`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
  `parent_id` bigint(20) NULL DEFAULT NULL COMMENT '父ID',
  `note` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注,用于google搜索页面描述',
  `is_display` int(1) NULL DEFAULT NULL COMMENT '是否可见 1:可见 0:不可见',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKA8168A929B5A332`(`parent_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '商品类型' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bbs_user
-- ----------------------------
DROP TABLE IF EXISTS `bbs_user`;
CREATE TABLE `bbs_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码，加密存储',
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '注册手机号',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '注册邮箱',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE,
  UNIQUE INDEX `phone`(`phone`) USING BTREE,
  UNIQUE INDEX `email`(`email`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 43 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for db_reverse_pojo
-- ----------------------------
DROP TABLE IF EXISTS `db_reverse_pojo`;
CREATE TABLE `db_reverse_pojo`  (
  `tb_tinyint` tinyint(4) NULL DEFAULT NULL,
  `tb_smallint` smallint(6) NULL DEFAULT NULL,
  `tb_mediumint` mediumint(9) NULL DEFAULT NULL,
  `tb_int` int(11) NULL DEFAULT NULL,
  `tb_bigint` bigint(20) NULL DEFAULT NULL,
  `tb_bit` bit(1) NULL DEFAULT NULL,
  `tb_double` double NULL DEFAULT NULL,
  `tb_float` float NULL DEFAULT NULL,
  `tb_decimal` decimal(10, 0) NULL DEFAULT NULL,
  `tb_char` char(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `tb_varchar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `tb_date` date NULL DEFAULT NULL,
  `tb_time` time(0) NULL DEFAULT NULL,
  `tb_year` year NULL DEFAULT NULL,
  `tb_timestamp` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `tb_datetime` datetime(0) NULL DEFAULT NULL,
  `tb_tinyblob` tinyblob NULL,
  `tb_blob` blob NULL,
  `tb_mediumblob` mediumblob NULL,
  `tb_longblob` longblob NULL,
  `tb_tinytext` tinytext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `tb_text` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `tb_mediumtext` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `tb_longtext` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `tb_enum` enum('') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '',
  `tb_set` set('') CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '',
  `tb_binary` binary(255) NULL DEFAULT NULL,
  `tb_varbinary` varbinary(255) NULL DEFAULT NULL,
  `tb_point` point NULL,
  `tb_linestring` linestring NULL,
  `tb_polygon` polygon NULL,
  `tb_geometry` geometry NULL,
  `tb_multipoint` multipoint NULL,
  `tb_multilinestring` multilinestring NULL,
  `tb_multipolygon` multipolygon NULL,
  `tb_geometrycollection` geomcollection NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
