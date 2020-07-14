<template>
    <div>
        <el-table
                :data="tableData"
                border
                style="width: 100%">
            <el-table-column
                    fixed
                    prop="id"
                    label="编号"
                    width="150">
            </el-table-column>
            <el-table-column
                    prop="name"
                    label="书名"
                    width="120">
            </el-table-column>
            <el-table-column
                    prop="author"
                    label="作者"
                    width="120">
            </el-table-column>

            <el-table-column

                    label="操作"
                    width="100">
                <template slot-scope="scope">
                    <el-button @click="edit(scope.row)" type="text" size="small">修改</el-button>
                    <el-button @click="deleteById(scope.row)" type="text" size="small">删除</el-button>
                </template>
            </el-table-column>
        </el-table>
        <el-pagination
                background
                layout="prev, pager, next"
                :page-size="pageSize"
                :total="total"
                @current-change="page">
        </el-pagination>
    </div>

</template>

<script>
    export default {
        methods: {
            deleteById(row) {
                const _this = this
                axios.delete("http://localhost:8081/book/delete/"+row.id).then(function (resp) {
                    //_this.$router.push("/")
                    window.location.reload();
                })
            },
            edit(row) {
                this.$router.push({
                    path: "/update",
                    query: {
                        id: row.id
                    }
                });
            },
            page(currentPage){
                const _this = this
                axios.get("http://localhost:8081/book/findAll/"+currentPage+"/2").then(function (resp) {
                    _this.tableData = resp.data.records
                    _this.total = resp.data.total
                    _this.pageSize = resp.data.size
                })
            }
        },
        created() {
            const _this = this
            axios.get("http://localhost:8081/book/findAll/1/2").then(function (resp) {
                console.log(resp)
                _this.tableData = resp.data.records
                _this.total = resp.data.total
                _this.pageSize = resp.data.size

            })
        },

        data() {
            return {
                pageSize: null,
                total: null,
                tableData: null
            }
        }
    }
</script>

<style scoped>

</style>