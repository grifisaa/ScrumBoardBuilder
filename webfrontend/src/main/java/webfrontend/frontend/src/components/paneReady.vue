<template>
  <h3>Ready</h3>
  <div class="insideDiv">
    <h4>temp7</h4>
    <h5>description7</h5>
  </div>
  <div class="insideDiv">
    <h4>temp8</h4>
    <h5>description8</h5>
  </div>
</template>

<script>
export default {
  name: "paneReady"
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