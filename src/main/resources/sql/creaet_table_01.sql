CREATE TABLE `user` (
    `id` int NOT NULL AUTO_INCREMENT COMMENT 'ID ',
    `username` varchar(100) DEFAULT NULL COMMENT '用户名',
    `password` varchar(100) DEFAULT NULL COMMENT '密码',
    `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `version` int DEFAULT NULL COMMENT 'version',
    PRIMARY KEY (`id`),
    KEY `key_username` (`username`),
    KEY `key_phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户表'