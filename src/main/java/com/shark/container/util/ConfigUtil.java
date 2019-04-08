package com.shark.container.util;

import com.shark.container.common.ConfigConst;

import java.util.Properties;

/**
 * @Author: Shark Chili
 * @Email: sharkchili.su@gmail.com
 * @Date: 2018/12/11 0011
 */
public class ConfigUtil {

	/**
	 * Get a {@link ConfigConst} from properties or default value
	 * @param properties {@link Properties} file
	 * @param key key string
	 * @param defaultValue default {@link ConfigConst}
	 * @return instance of {@link ConfigConst}
	 */
	public static ConfigConst getOrDefault(Properties properties, String key, ConfigConst defaultValue){
		Object value=properties.get(key);
		if (value==null){
			return defaultValue.getDefault();
		}else {
			return defaultValue.getByName(value.toString());
		}
	}

}
