package com.kennedy.aspire.navigation

const val ROUTE_HOME="home"
const val ROUTE_ABOUT="about"
const val ROUTE_CONTACT="contact"
const val ROUTE_ITEM="item"
const val ROUTE_SPLASH="splash"
const val ROUTE_SCAFOLD="scaffold"
const val ROUTE_INTENT="intent"
const val ROUTE_DETAIL="detail"
const val ROUTE_CATEGORY="category"
const val ROUTE_DASHBOARD="dashboard"
const val ROUTE_FORM="form"

//Auth

const val ROUTE_REGISTER= "register"
const val ROUTE_LOGIN= "login"

//Crud products
const val ROUTE_ADD_PRODUCT = "add_product"
const val ROUTE_PRODUCT_LIST = "product_list"
const val ROUTE_EDIT_PRODUCT = "edit_product/{productId}"
// ✅ Helper function for navigation
fun editProductRoute(productId: Int) = "edit_product/$productId"