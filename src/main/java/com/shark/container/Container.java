package com.shark.container;

public interface Container {
	/**
	 * Container init
	 * @return Container
	 */
	public Container init();

	/**
	 * Container start
	 * @return Container
	 */
	public Container start();

	/**
	 * Container stop
	 * @return Container
	 */
	public Container stop();

	/**
	 * Container init finally,sub class could implement this method,this method will be call in the final area of int()
	 */
	public void containerInit();

	/**
	 * Container start finally,sub class could implement this method,this method will be call in the final area of start()
	 */
	public void containerStart();

	/**
	 * Container stop finally,sub class could implement this method,this method will be call in the final area of stop()
	 */
	public void containerStop();
}
