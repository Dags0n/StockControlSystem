package com.stockcontrol.stockcontrol.controllers;

import com.stockcontrol.stockcontrol.dtos.ProductDTO;
import com.stockcontrol.stockcontrol.entities.ProductEntity;
import com.stockcontrol.stockcontrol.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String showProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product/productlist";
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> getProductById(@PathVariable Long id) {
        return productService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/create")
    public String showCreateProductForm(Model model) {
        model.addAttribute("product", new ProductEntity());
        return "product/productcreate";
    }

    @PostMapping
    public String createProduct(@ModelAttribute("product") ProductEntity product) {
        productService.create(product);
        return "redirect:/products";
    }

    @GetMapping("/update/{id}")
    public String showUpdateProductForm(@PathVariable Long id, Model model) {
        productService.findById(id).ifPresent(product -> model.addAttribute("product", product));
        return "product/productupdate";
    }

    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable Long id, @ModelAttribute("product") ProductDTO productDTO) {
        productService.update(id, productDTO);
        return "redirect:/products";
    }

    @PostMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.delete(id);
        return "redirect:/products";
    }
}
