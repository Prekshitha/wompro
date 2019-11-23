package com.service;

import java.util.List;

import com.model.Hostel;
import com.model.Ngotable;
import com.model.Training;

public interface MyNgoServiceIntf {

	boolean insertngo(Ngotable ngo);

	boolean inserttraining(Training training);

	List<Training> getTraining();

	boolean insertForm(Hostel hostel);

	List<Hostel> getUserh();

}
