/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : testspring

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-01-23 11:32:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '赵', '123');
INSERT INTO `user` VALUES ('2', '钱', 'wew');
INSERT INTO `user` VALUES ('4', '孙', 'asdadf');
INSERT INTO `user` VALUES ('5', '李', 'li');
INSERT INTO `user` VALUES ('6', '李', 'li');
INSERT INTO `user` VALUES ('7', '周', 'zhou');
INSERT INTO `user` VALUES ('8', '李', 'li');
