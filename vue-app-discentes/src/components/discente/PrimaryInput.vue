<script setup>
import { ref, toRefs } from 'vue';

const props = defineProps({
  label: String,
  type: {
    type: String,
    default: 'text'
  },
  placeholder: String
});

const emit = defineEmits(['update:value']);
const { label, type, placeholder } = toRefs(props);
const inputValue = ref('');

const updateInput = () => {
  emit('update:value', inputValue.value);
};
</script>

<template>
    <div class="input-group">
      <label>{{ label }}</label>
      <input :type="type" v-model="inputValue" :placeholder="placeholder" @input="updateInput" />
    </div>
  </template>

  
  <style scoped>
  .input-group {
    width: 80%;
    margin-bottom: 10px;
    display: flex;
    flex-direction: column;
    /* align-self: center; */
  }

  label {
    font-weight: bold;
    margin-bottom: 5px;
    align-self: self-start;
  }

  input {
    padding: 8px;
    border: 1px solid #63676C;
    border-radius: 10px;
  }
  </style>
  