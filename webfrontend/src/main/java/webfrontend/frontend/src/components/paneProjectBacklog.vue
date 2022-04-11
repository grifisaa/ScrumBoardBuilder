<template>
  <h3>Project Backlog</h3>
  <div class="insideDiv">
    <h4>temp1</h4>
    <h5>description1</h5>
  </div>
  <div class="insideDiv">
    <h4>temp2</h4>
    <h5>description2</h5>
  </div>


</template>

<script>

export default {
  name: "paneProjectBacklog",
  props: {
    UserStory: Array,
  },
  components: {
  },

}
</script>

<style scoped>
.insideDiv {
  border: 1px solid black;
  margin: 5px;
  text-align: center;
  min-width: 96%;
}
h4 {
  text-align: left;
  margin: 5px;
}
h5 {
  text-align: left;
  margin: 5px;
}
</style>