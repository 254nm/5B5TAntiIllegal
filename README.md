### 5B5TAntiIllegal

___

# Features

* Reverts Invalid enchantments
* Deletes lore
* Mostly configureable
* Efficent code to not lag your server
* Can check shulkerboxes inside of chests for illegal items
* Toggleable ChunkLoad anti illegal

___

# Config

```yml
#What events should we listen to?
AntiIllegal:
  Block-Place-Enabled: true
  ChunkLoad-Enabled: false
  HopperTransfer-Enabled: true
  InventoryClose-Enabled: true
  InventoryOpen-Enabled: true
  PlayerHotbarMove-Enabled: true
  ItemPickup: true
  RevertStackedItems: false
  #What items are illegal?
  Illegal-Items-List:
    - "BEDROCK"
    - "COMMAND_REPEATING"
    - "COMMAND_MINECART"
    - "COMMAND_CHAIN"
    - "COMMAND"
    - "ENDER_PORTAL_FRAME"
    - "KNOWLEDGE_BOOK"
    - "MOB_SPAWNER"
    - "PORTAL"
    - "STRUCTURE_BLOCK"
    - "STRUCTURE_VOID"
```

___

# Commands

* /airl ~ Reloads the configureation file for the plugin
