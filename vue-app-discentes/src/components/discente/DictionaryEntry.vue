
<script setup>
import { ref } from 'vue';
// import { upvoteEntry, downvoteEntry } from '../services/api';

// const props = defineProps({
//   entry: Object,
// });

// const handleUpvote = async () => {
//   await upvoteEntry(entry.id);
//   entry.upvotes++;
// };

// const handleDownvote = async () => {
//   await downvoteEntry(entry.id);
//   entry.downvotes++;
// };
</script>


<template>
    <div class="entry-card">
      <h3>{{ entry.title }}</h3>
      <p><strong>Top Comentário:</strong> {{ entry.topComment }}</p>
      <div class="entry-votes">
        <button @click="handleUpvote">👍 {{ entry.upvotes }}</button>
        <button @click="handleDownvote">👎 {{ entry.downvotes }}</button>
      </div>
    </div>
  </template>
  
  
  <style scoped>
  .entry-card {
    border: 1px solid #ddd;
    padding: 16px;
    border-radius: 8px;
    margin-bottom: 16px;
  }
  .entry-votes button {
    margin-right: 8px;
  }
  </style>
  