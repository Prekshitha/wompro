package com.dao;

import java.util.List;

import com.model.Hostel;
import com.model.Ngotable;
import com.model.Training;

public interface MyNgoDaoIntf {

	boolean insertngo(Ngotable ngo);

	List<Ngotable> getNgo();

	boolean inserttraining(Training training);

	List<Training> gettraining();

	boolean insertForm(Hostel hostel);

	List<Hostel> getUserh();

}
