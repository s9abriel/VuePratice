<template>
  <div>
      <h1>用户列表</h1>
      <table border="1">
        <tr>
          <td>编号</td>
          <td>姓名</td>
          <td>年龄</td>
          <td>生日</td>
        </tr>
        <tr v-for='user in users'>
          <td>{{ user.id }}</td>
          <td>{{ user.name }}</td>
          <td>{{ user.age }}</td>
          <td>{{ user.bir }}</td>
          <td><a href="javascript:;" @click="delRow(user.id)">删除</a> <a href="">修改</a></td>
        </tr>
      </table>
      <a href="#/user/add">添加</a>
      <router-view></router-view>
  </div>
</template>

<script>
export default {
    name:"User",
    data(){
      return{
        users:[]
      }
    },
    methods:{
      findAll(){
        this.$http.get("http://rap2.taobao.org:38080/app/mock/266813/user/findAll?page=1&rows=4").then((res)=>{
          // console.log(res.data);
          this.users = res.data.results;
        });
      },
      delRow(id){
        console.log(id);
        this.$http.get("http://rap2.taobao.org:38080/app/mock/266813/user/delete").then(res=>{
          console.log(res);
        })
      }
    },
    components:{},
    created(){
      this.findAll();
    },
    watch: {
      $route: {
        handler: function(val, oldVal){
          console.log(val);
          if (val.path=='/user') {
            this.findAll();
          }
        },
        // 深度观察监听
        deep: true
      }
    }

}
</script>

<style>

</style>