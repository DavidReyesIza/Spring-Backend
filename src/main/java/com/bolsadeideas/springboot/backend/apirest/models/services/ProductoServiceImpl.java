package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IProductoDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	IProductoDao productoDao;

	@Override
	public List<Producto> findAll() {
		
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto save(Producto producto) {
		
		return productoDao.save(producto);
	}

	@Override
	public void delete(Long id) {
		productoDao.deleteById(id);
		
	}


}
