<template>
    <div>
        <h2>用户添加信息</h2>
        <form action="" >
            用户:<input type="text" v-model="user.name"><br>
            年龄:<input type="text" v-model="user.age"><br>
            生日:<input type="text" v-model="user.bir"><br>
            <input type="button" name="" id="" @click="saveUserInfo" value="添加用户信息">
        </form>
    </div>
</template>

<script>
export default {
    name:"UserAdd",
    data(){
        return{
            user:{},
        }
    },
    methods:{
        saveUserInfo(){
            console.log(this.user);
            this.$http.post('http://rap2.taobao.org:38080/app/mock/266813/user/add',this.user).then(res=>{
                    console.log(res);
                    if(res.data.success){
                        this.$router.push("/user");
                    }
                });
            }
        }
    }

</script>

<style>

</style>