<template>
  <h1 style="background: #dedede" title="{{words}}">{{words}}</h1>
</template>

<script>
export default {
  name: "Heading_here",
  props: {
    words: String,
  }
}
</script>