package com.ezen.word.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ezen.word.dao.WordDao;
import com.ezen.word.dto.WordSet;

public class WordRegisetService {
	
	@Autowired
	private WordDao worddao;
	
	//public WordRegisetService(WordDao wdao) {
	//	this.wdao = wdao;
	//}
	
	public void register(WordSet wordSet) {
		worddao.insert(wordSet);
	}
	
}
