package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long nextId = 1L;

    // GET: Retornar todos os produtos
    public List<Product> getAllProducts() {  
        return products;
    }

    // POST: Adicionar um novo produto
    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    // GET: Buscar produto por id
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    // PUT: Atualizar produto
    public Optional<Product> updateProduct(Long id, Product updatedProduct) {
        Optional<Product> existingProduct = getProductById(id);
        if (existingProduct.isPresent()) {
            Product product = existingProduct.get();
            product.setName(updatedProduct.getName());
            return Optional.of(product);
        }
        return Optional.empty();
    }

    // DELETE: Deletar produto
    public boolean deleteProduct(Long id) {
        Optional<Product> product = getProductById(id);
        if (product.isPresent()) {
            products.remove(product.get());
            return true;
        }
        return false;
    }
}



