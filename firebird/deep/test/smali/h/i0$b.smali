.class public Lh/i0$b;
.super Landroid/database/DataSetObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lh/i0;


# direct methods
.method public constructor <init>(Lh/i0;)V
    .locals 0

    iput-object p1, p0, Lh/i0$b;->a:Lh/i0;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    iget-object v0, p0, Lh/i0$b;->a:Lh/i0;

    invoke-virtual {v0}, Lh/i0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh/i0$b;->a:Lh/i0;

    invoke-virtual {v0}, Lh/i0;->i()V

    :cond_0
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    iget-object v0, p0, Lh/i0$b;->a:Lh/i0;

    invoke-virtual {v0}, Lh/i0;->dismiss()V

    return-void
.end method
