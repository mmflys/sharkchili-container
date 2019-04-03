package com.shark.container.boot;

import com.shark.container.Container;

/**
 * @Author: SuLiang
 * @Date: 2018/11/14
 */
public interface Boot {

	/**
	 * Set a container
	 * @param container that need to be started
	 * @return Boot
	 */
	Boot container(Container container);

	/**
	 * Get the container
	 * @param <T> The type of Container
	 * @return Container
	 */
	<T> T container();

	/**
	 * Launch the container
	 * @return Boot
	 */
	Boot launch();

	/**
	 * Provide a default container
	 * @return Container
	 */
	Container provide();
}
