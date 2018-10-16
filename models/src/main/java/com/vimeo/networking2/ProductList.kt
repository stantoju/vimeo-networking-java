package com.vimeo.networking2

/**
 * List of products that could be paged.
 */
data class ProductList(
    override val total: Int? = null,
    override val page: Int? = null,
    override val perPage: Int? = null,
    override val paging: Paging? = null,
    override val data: List<Product>? = null
) : Pageable<Product>
