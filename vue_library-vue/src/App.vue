<template>
<!--  <div id="app">-->
<!--    <el-container style="height: 500px; border: 1px solid #eee">-->
<!--      <el-aside width="200px" style="background-color: rgb(238, 241, 246)">-->
<!--        <el-menu>-->
<!--          <el-submenu v-for="(item,index) in $router.options.routes" :index="index+''">-->
<!--            <template slot="title"><i class="el-icon-message"></i>{{item.name}}</template>-->
<!--            <el-menu-item v-for="(item2,index2) in item.children" :index="index+'-'+index2">{{item2.name}}</el-menu-item>-->
<!--          </el-submenu>-->
<!--        </el-menu>-->
<!--      </el-aside>-->

<!--      <el-container>-->
<!--        <el-header style="text-align: right; font-size: 12px">-->
<!--          <el-dropdown>-->
<!--            <i class="el-icon-setting" style="margin-right: 15px"></i>-->
<!--          </el-dropdown>-->
<!--          <span>王小虎</span>-->
<!--        </el-header>-->

<!--        <el-main>-->
<!--          c-->
<!--        </el-main>-->
<!--      </el-container>-->
<!--    </el-container>-->
<!--  </div>-->
  <router-view></router-view>
</template>


<script>
  export default {

  };
</script>

<style>
  .el-header {
    background-color: #B3C0D1;
    color: #333;
    line-height: 60px;
  }

  .el-aside {
    color: #333;
  }
</style>
