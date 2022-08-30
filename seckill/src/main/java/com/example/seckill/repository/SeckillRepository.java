package com.example.seckill.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.seckill.common.entity.Seckill;

public interface SeckillRepository extends JpaRepository<Seckill, Long> {
	
	
}
