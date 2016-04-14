/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the source code license agreement you entered into with wavemaker-com*/

package com.salesdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.salesdb.*;

/**
 * Service object for domain model class Tasks.
 * @see com.salesdb.Tasks
 */

public interface TasksService {
   /**
	 * Creates a new tasks.
	 * 
	 * @param created
	 *            The information of the created tasks.
	 * @return The created tasks.
	 */
	public Tasks create(Tasks created);

	/**
	 * Deletes a tasks.
	 * 
	 * @param tasksId
	 *            The id of the deleted tasks.
	 * @return The deleted tasks.
	 * @throws EntityNotFoundException
	 *             if no tasks is found with the given id.
	 */
	public Tasks delete(Integer tasksId) throws EntityNotFoundException;

	/**
	 * Finds all taskss.
	 * 
	 * @return A list of taskss.
	 */
	public Page<Tasks> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Tasks> findAll(Pageable pageable);
	
	/**
	 * Finds tasks by id.
	 * 
	 * @param id
	 *            The id of the wanted tasks.
	 * @return The found tasks. If no tasks is found, this method returns
	 *         null.
	 */
	public Tasks findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a tasks.
	 * 
	 * @param updated
	 *            The information of the updated tasks.
	 * @return The updated tasks.
	 * @throws EntityNotFoundException
	 *             if no tasks is found with given id.
	 */
	public Tasks update(Tasks updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the taskss in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the tasks.
	 */

	public long countAll();


    public Page<Tasks> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}
