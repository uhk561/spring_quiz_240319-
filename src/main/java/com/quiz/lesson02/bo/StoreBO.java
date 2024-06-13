package com.quiz.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson02.domain.Store;
import com.quiz.lesson02.mapper.StoreMapper;

@Service
public class StoreBO {
	// Spring bean을 Autowired를 통해서 가져온다.
		@Autowired // Dependency Inject(DI): 의존성 주입
		private StoreMapper storeMapper;
		
		//  input: X(컨트롤러로부터 요청)
		// output: List<Store>
		
		public List<Store> getStoreList() {
			
			return storeMapper.selectStoreList();
		}
}
