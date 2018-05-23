package com.generation.config;

import com.generation.db.bean.Tienda;
import com.generation.db.repo.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner{

    private final TiendaRepository tiendaRepository;

    @Autowired
    public DatabaseLoader(TiendaRepository tiendaRepository) {
        this.tiendaRepository = tiendaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.tiendaRepository.save(new Tienda("Walmart", "Supermercado", "Avenida avenida", "500", "89679057"));
        this.tiendaRepository.save(new Tienda("Tienda", "SuperCategoria", "SuperDireccion", "800", "89696789"));
        this.tiendaRepository.save(new Tienda("Hola tienda", "Hola Categoria", "Hola Direccion", "666", "329647329"));

    }
}
