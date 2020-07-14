import Vue from 'vue'
import VueRouter from 'vue-router'
import BookManage from "../views/BookManage";
import AddBook from "../views/AddBook";
import Index from "../views/index"
import BookUpdate  from "../views/BookUpdate";

Vue.use(VueRouter)

  const routes = [
  {
    path: '/',
    name: '图书管理',
    component: Index,
    show : true,
    redirect: "/bookManage",
    children: [
      {
        path: '/bookManage',
        name: '查询图书',
        component: BookManage
      },
      {
        path: '/addBook',
        name: '添加图书',
        component: AddBook
      }
    ]
  },
  {
   path: '/update',
   name: '更新图书',
    show : false,
   component: BookUpdate
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
