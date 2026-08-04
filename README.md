# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 10: 武器に特殊効果をつけよう

このステップでは、銀の剣で敵を殴ると「発光（Glowing）」効果がつくようにします。
Forgeのイベントシステムを使って、攻撃時の処理を追加します。

### やること
- [`ModEvents.java`](src/main/java/tech/takanaru/tutorialmod/event/ModEvents.java) を作成してイベントハンドラを書く
- `LivingHurtEvent` で攻撃を検知し、銀の剣で攻撃した場合にGlowing効果を付与する

### 追加するファイル
| ファイル | 種類 |
|---------|------|
| [`src/main/java/tech/takanaru/tutorialmod/event/ModEvents.java`](src/main/java/tech/takanaru/tutorialmod/event/ModEvents.java) | 新規 |

### テクスチャ
このステップでは新しいテクスチャは不要です。
