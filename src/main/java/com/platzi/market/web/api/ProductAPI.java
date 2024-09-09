package com.platzi.market.web.api;

import com.platzi.market.domain.Product;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Tag(name = "ProductController", description = "The product API")
public interface ProductAPI {

    @Operation(
            summary = "Retrieve all products from the supermarket",
            description = "This operation fetches a list of all products in the supermarket database."
    )
    @ApiResponse(responseCode = "200", description = "OK")
    ResponseEntity<List<Product>> getAll();

    ResponseEntity<List<Product>> getByCategory(@PathVariable("categoryId") int categoryId);

    @Operation(
            summary = "Find product by ID",
            description = "Retrieve details of a specific product by its unique ID. "
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "404", description = "Product not found")
    })
    ResponseEntity<Product> getProduct (
            @Parameter(
                    description = "The id of product",
                    required = true,
                    example = "7"
            )
            @PathVariable("id")  int productId
    );
    ResponseEntity<Product> save(@RequestBody Product product);
    ResponseEntity delete(@PathVariable("id") int productId);
}
