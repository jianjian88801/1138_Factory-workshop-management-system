const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootd07er/",
            name: "springbootd07er",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "工厂车间管理系统的设计与实"
        } 
    }
}
export default base
