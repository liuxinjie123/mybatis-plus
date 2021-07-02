CREATE TABLE `user` (
    `id` int NOT NULL AUTO_INCREMENT COMMENT 'ID ',
    `username` varchar(100) DEFAULT NULL COMMENT '用户名',
    `password` varchar(100) DEFAULT NULL COMMENT '密码',
    `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
    `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `version` int DEFAULT '1' COMMENT 'version',
    `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
    `delete_flag` tinyint(1) DEFAULT NULL COMMENT '逻辑删除（0 未删除、1 删除）',
    PRIMARY KEY (`id`),
    KEY `key_username` (`username`),
    KEY `key_phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户表';