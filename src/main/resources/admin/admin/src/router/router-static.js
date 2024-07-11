import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import renyuan from '@/views/modules/renyuan/list'
    import shengchankaili from '@/views/modules/shengchankaili/list'
    import shengchangongxu from '@/views/modules/shengchangongxu/list'
    import kanbanxinxi from '@/views/modules/kanbanxinxi/list'
    import shengchanliucheng from '@/views/modules/shengchanliucheng/list'
    import shebeixinxi from '@/views/modules/shebeixinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/renyuan',
        name: '人员',
        component: renyuan
      }
      ,{
	path: '/shengchankaili',
        name: '生产开立',
        component: shengchankaili
      }
      ,{
	path: '/shengchangongxu',
        name: '生产工序',
        component: shengchangongxu
      }
      ,{
	path: '/kanbanxinxi',
        name: '看板信息',
        component: kanbanxinxi
      }
      ,{
	path: '/shengchanliucheng',
        name: '生产流程',
        component: shengchanliucheng
      }
      ,{
	path: '/shebeixinxi',
        name: '设备信息',
        component: shebeixinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
