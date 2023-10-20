
``` mermaid
classDiagram
  class Task {
    id_task: number
    name: string
    priority: string
    initial_date: string
    final_date: string
    description: string
  }

  Task --|> id_task: number
  Task --|> name: string
  Task --|> priority: string
  Task --|> initial_date: string
  Task --|> final_date: string
  Task --|> description: string
  ```