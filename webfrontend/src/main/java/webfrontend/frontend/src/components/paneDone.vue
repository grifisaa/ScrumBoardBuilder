<template>
  <h3>Done</h3>
  <div class="insideDiv">
    <h4>temp11</h4>
    <h5>description11</h5>
  </div>
  <div class="insideDiv">
    <h4>temp12</h4>
    <h5>description12</h5>
  </div>
</template>

<script>
export default {
  name: "paneDone"
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