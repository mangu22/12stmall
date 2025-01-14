
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import SearchProductView from "./components/SearchProductView"
import SearchProductViewDetail from "./components/SearchProductViewDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/orderBcs/searchProducts',
                name: 'SearchProductView',
                component: SearchProductView
            },
            {
                path: '/orderBcs/searchProducts/:id',
                name: 'SearchProductViewDetail',
                component: SearchProductViewDetail
            },




    ]
})
