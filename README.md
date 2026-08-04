# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 11: ツールチップを追加しよう

このステップでは、アイテムにマウスを乗せたときに表示される説明文（ツールチップ）を追加します。
色つきのテキストで、アイテムの特徴を説明できます。

### やること
- [`ModEvents.java`](src/main/java/tech/takanaru/tutorialmod/event/ModEvents.java) に `ItemTooltipEvent` のハンドラを追加する
- 銀の剣に「敵を発光させる」の説明文をつける
- 銀インゴットに「不思議な銀の金属...」の説明文をつける
- 翻訳ファイルにツールチップ用テキストを追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| [`src/main/java/tech/takanaru/tutorialmod/event/ModEvents.java`](src/main/java/tech/takanaru/tutorialmod/event/ModEvents.java) | 編集 |
| [`src/main/resources/assets/takanarumod/lang/en_us.json`](src/main/resources/assets/takanarumod/lang/en_us.json) | 編集 |
| [`src/main/resources/assets/takanarumod/lang/ja_jp.json`](src/main/resources/assets/takanarumod/lang/ja_jp.json) | 編集 |

### テクスチャ
このステップでは新しいテクスチャは不要です。
