package com.vimeo.networking2

data class Interaction(

    /**
     * An array of the HTTP methods permitted on this URI. This data requires a bearer
     * token with the private scope.
     */
    val options: List<String>?,

    /**
     * The API URI that resolves to the connection data. This data requires a bearer
     * token with the private scope.
     */
    val uri: String?

)