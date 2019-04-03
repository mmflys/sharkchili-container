package com.shark.container.boot;

import com.shark.container.Container;
import com.shark.container.constants.BootStatus;
import com.shark.container.exception.BootException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The abstract class of interface Boot
 * @Author: SuLiang
 * @Date: 2018/11/14
 */
public abstract class Bootstrap implements Boot{
	private static final Logger LOGGER= LoggerFactory.getLogger(Bootstrap.class);

	private Container container;
	private BootStatus bootStatus;

	public Bootstrap() {
		this.bootStatus=BootStatus.ZERO;
	}

	@Override
	public Boot container(Container container) {
		this.container=container;
		return this;
	}

	@Override
	public <T> T container() {
		checkContainerNull();
		checkLaunch();
		return (T) this.container;
	}

	@Override
	public Boot launch() {
		LOGGER.info("boot launch start...");
		checkContainerNull();
		container.init().start();
		this.bootStatus=BootStatus.RUNNING;
		return this;
	}

	/**
	 * Check whether container had been set or not,if not set the provide default value.
	 */
	private void checkContainerNull() {
		if (this.container==null){
			if (provide()==null){
				throw new BootException("container had`t been initialized.");
			}else {
				this.container=provide();
			}
		}
	}

	/**
	 * Check whether boot had been launched or not,if not launch it.
	 */
	private void checkLaunch(){
		if (this.bootStatus!=BootStatus.RUNNING){
			LOGGER.info("the boot had`t been launched,so launch it");
			this.launch();
		}
	}

	public abstract Container provide();
}
