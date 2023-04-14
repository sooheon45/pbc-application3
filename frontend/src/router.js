
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import ManufacturingManager from "./components/listers/ManufacturingCards"
import ManufacturingDetail from "./components/listers/ManufacturingDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/manufacturings',
                name: 'ManufacturingManager',
                component: ManufacturingManager
            },
            {
                path: '/manufacturings/:id',
                name: 'ManufacturingDetail',
                component: ManufacturingDetail
            },



    ]
})
