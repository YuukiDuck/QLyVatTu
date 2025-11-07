package k66httt.ttcn.qlyvattu.service;

import k66httt.ttcn.qlyvattu.dto.ProductDto;
import k66httt.ttcn.qlyvattu.entity.*;
import k66httt.ttcn.qlyvattu.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final SupplierRepository supplierRepository;

    private ProductDto mapToDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .code(product.getCode())
                .name(product.getName())
                .description(product.getDescription())
                .shortDescription(product.getShortDescription())
                .price(product.getPrice())
                .comparePrice(product.getComparePrice())
                .status(product.getStatus())
                .quantitySold(product.getQuantitySold())
                .unit(product.getUnit())
                .origin(product.getOrigin())
                .createdAt(product.getCreatedAt())
                .updatedAt(product.getUpdatedAt())
                .categoryId(product.getCategory() != null ? product.getCategory().getId() : null)
                .supplierId(product.getSupplier() != null ? product.getSupplier().getId() : null)
                .build();
    }

    private Product mapToEntity(ProductDto dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setCode(dto.getCode());
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setShortDescription(dto.getShortDescription());
        product.setPrice(dto.getPrice());
        product.setComparePrice(dto.getComparePrice());
        product.setStatus(dto.getStatus());
        product.setDeleted(false);
        product.setQuantitySold(dto.getQuantitySold());
        product.setUnit(dto.getUnit());
        product.setOrigin(dto.getOrigin());
        product.setCreatedAt(LocalDateTime.now());
        product.setUpdatedAt(LocalDateTime.now());

        if (dto.getCategoryId() != null) {
            Category category = categoryRepository.findById(dto.getCategoryId())
                    .orElseThrow(() -> new RuntimeException("Category not found"));
            product.setCategory(category);
        }

        if (dto.getSupplierId() != null) {
            Supplier supplier = supplierRepository.findById(dto.getSupplierId())
                    .orElseThrow(() -> new RuntimeException("Supplier not found"));
            product.setSupplier(supplier);
        }

        return product;
    }

    public ProductDto createProduct(ProductDto dto) {
        Product product = mapToEntity(dto);
        Product saved = productRepository.save(product);
        return mapToDto(saved);
    }

    public ProductDto updateProduct(Long id, ProductDto dto) {
        Product existing = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        existing.setName(dto.getName());
        existing.setDescription(dto.getDescription());
        existing.setShortDescription(dto.getShortDescription());
        existing.setPrice(dto.getPrice());
        existing.setComparePrice(dto.getComparePrice());
        existing.setStatus(dto.getStatus());
        existing.setQuantitySold(dto.getQuantitySold());
        existing.setUnit(dto.getUnit());
        existing.setOrigin(dto.getOrigin());
        existing.setUpdatedAt(LocalDateTime.now());

        if (dto.getCategoryId() != null) {
            Category category = categoryRepository.findById(dto.getCategoryId())
                    .orElseThrow(() -> new RuntimeException("Category not found"));
            existing.setCategory(category);
        }

        if (dto.getSupplierId() != null) {
            Supplier supplier = supplierRepository.findById(dto.getSupplierId())
                    .orElseThrow(() -> new RuntimeException("Supplier not found"));
            existing.setSupplier(supplier);
        }

        return mapToDto(productRepository.save(existing));
    }

    public void deleteProduct(Long id) {
        Product p = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        p.setDeleted(true);
        productRepository.save(p);
    }

    public ProductDto getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        return mapToDto(product);
    }

    public List<ProductDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .filter(p -> !Boolean.TRUE.equals(p.getDeleted()))
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }
}
