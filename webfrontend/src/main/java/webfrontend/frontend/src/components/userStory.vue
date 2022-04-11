<template>
  <div>
    <h3>{{userStory.title}}</h3>
    <p>{{userStory.description}}</p>
  </div>
</template>

<script>
  export default {
    name: "userStory",
    props: {
      userStory: Object
    }
  }
</script>

<style scoped>

</style>