.class public Le0/m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le0/m;->g(Landroid/view/View;Le0/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Le0/k;


# direct methods
.method public constructor <init>(Le0/k;)V
    .locals 0

    iput-object p1, p0, Le0/m$a;->a:Le0/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    .line 1
    new-instance v0, Le0/s;

    .line 2
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-direct {v0, p2}, Le0/s;-><init>(Landroid/view/WindowInsets;)V

    .line 4
    iget-object p2, p0, Le0/m$a;->a:Le0/k;

    invoke-interface {p2, p1, v0}, Le0/k;->a(Landroid/view/View;Le0/s;)Le0/s;

    move-result-object p1

    invoke-virtual {p1}, Le0/s;->g()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
