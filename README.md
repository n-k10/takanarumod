# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 04: ルートテーブルを追加しよう

このステップでは、ブロックを壊したときに何がドロップするかを設定します。
ルートテーブルがないとブロックを壊しても何も出てきません！

### やること
- 銀ブロック → そのまま銀ブロックをドロップ
- 銀鉱石 → 銀の原石をドロップ（Fortune対応・Silk Touch対応）

### 追加するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/resources/data/takanarumod/loot_tables/blocks/silver_block.json` | 新規 |
| `src/main/resources/data/takanarumod/loot_tables/blocks/silver_ore.json` | 新規 |

### テクスチャ
このステップでは新しいテクスチャは不要です。
