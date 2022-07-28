CREATE TABLE `books` (
                         `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '书id',
                         `type` varchar(100) NOT NULL COMMENT '书名',
                         `name` varchar(100) NOT NULL COMMENT '数量',
                         `description` varchar(200) NOT NULL COMMENT '描述',
                         KEY `bookID` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;