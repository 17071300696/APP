<template>
    <div class="coin"  v-if="showStatus" v-on:click.stop="clickCoin">
      <img class="img" :class="isMiss" src="../../assets/wakuang/elm.png"/>
      <div v-if="showNumber" class="number" :class="isShow">+{{addISC.toFixed(2)}}</div>
    </div>
</template>

<script>
  import { XButton } from 'vux'
  export default {
    props: ['isclID', 'addISC'],
    components: {XButton},
    mounted: function () {
      this.jiaodu = (Math.random() * 1000)
    },
    data () {
      return {
        jiaodu: '50',
        showStatus: true,
        showNumber: false,
        isMiss: '',
        isShow: ''
      }
    },
    methods: {
      clickCoin: function () {
        this.$emit('getCoin', this.isclID, this.addISC)
        console.log('click img')
        this.isMiss = 'miss'
        this.isShow = 'show'
        this.showNumber = true
        var _that = this
        setTimeout(function () {
          _that.showStatus = false
        }, '900')
      }
    }
  }
</script>

<style scoped>
  .img {
    height: 30px;
    width: 30px;
    position: absolute;
  }
  .number {
    color: white;
    top: 30px;
    position: absolute;
  }
  .show {
    animation: show1 1.3s  ;
    animation-fill-mode: forwards;
  }
  .miss {
    animation: miss1 1.3s  ;
    animation-fill-mode: forwards;
  }
  .coin {
    width: 30px;
    height: 30px;
    /*iphone上悬浮效果会影响定位,建议关闭*/
    /*background-color: #9ed99d;*/
    -webkit-animation: heart 1.3s ease-in-out 0.7s infinite alternate;
    -webkit-backface-visibility: hidden;
  }
  @-webkit-keyframes heart{
    from{
      /*transform: scale(1);*/
      transform:translate(0,0);
      /*top:0;*/
      /*left: 0;*/
      /*height: 50px;*/
      /*width: 50px;*/
      /*transform: scale(1);*/
      /*-webkit-transform: scale(1);*/
    }
    to{
      /*top:-10px;*/
      /*left: -10px;*/
      /*height: 70px;*/
      /*width: 70px;*/
      /*transform: scale(1);*/
      /*transform: scale(1.2);*/
      /*-webkit-transform: scale(1.2);*/
      transform:translate(0,3px);
    }
  }
  @keyframes miss1{
    0%{
      transform: scale(1);
      opacity: 1;
    }
    10%{
      transform: scale(1.2);
    }
    100%{
      transform: scale(1);
      opacity: 0;
    }
  }
  @keyframes show1{
    0%{
      opacity: 0;
    }
    30%{
      opacity: 1;
    }
    100%{
      opacity: 0;
    }
  }
</style>
